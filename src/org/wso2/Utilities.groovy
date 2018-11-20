package org.wso2

class Utilities implements Serializable {
    def steps
    def envs
    Utilities(steps) {this.steps = steps
    this.envs=steps.env
    }
    def create() {

//            steps.wrap([$class: 'AnsiColorBuildWrapper', 'colorMapName': 'XTerm']) {
//                steps.echo "Hello1 \\u001B[31mRed\\u001B[m"
//            }
//            steps.withCredentials([steps.usernamePassword(credentialsId: 'creds', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
//                steps.sh " echo ${envs.USER}"
//            }
        steps.echo "AMI"
        return "1234"

    }
    boolean createdirs(dirArray) {

        dirArray.each {
            steps.sh "echo ${it}"
            int status = steps.sh (
                    script: '''
                            test ! -d ${it} && mkdir -p ${it}
                            ''',
                    returnStatus: true
            )
            if (status == 1) {
                return false
            }
        }


        return true
    }
}