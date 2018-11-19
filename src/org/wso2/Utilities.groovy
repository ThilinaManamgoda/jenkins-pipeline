package org.wso2

class Utilities implements Serializable {
    def steps
    Utilities(steps) {this.steps = steps}
    def color() {
        steps.ansiColor('xterm') {
            steps.echo "Hello1 \\u001B[31mRed\\u001B[m"
            steps.withCredentials([usernamePassword(credentialsId: 'creds', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
                steps.sh " echo $USER"
            }
        }

    }
}
