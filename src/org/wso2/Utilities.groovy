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

}