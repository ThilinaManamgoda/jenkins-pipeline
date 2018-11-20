@Library("lib") import org.wso2.Utilities
def utils = new Utilities(this)
node {

    stage("utiu"){
       out = sh returnStatus: true, script: './ss.sh'
       echo out
        utils.color()
    }
    ansiColor('xterm') {
        stage( "\u001B[31mI'm Red\u001B[m Now not") {
            echo "Hello \u001B[31mRed\u001B[m"

        }


    }


}