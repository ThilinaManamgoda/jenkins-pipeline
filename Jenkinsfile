@Library("lib") import org.wso2.Utilities
def utils = new Utilities(this)
node {


    ansiColor('xterm') {
    stage("\u001B[31mI'm Red\u001B[m Now not") {
        utils.color()
        echo "Hello \u001B[31mRed\u001B[m"
        withCredentials([usernamePassword(credentialsId: 'creds', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
           echo "$USER"
        }
    }


    }


}