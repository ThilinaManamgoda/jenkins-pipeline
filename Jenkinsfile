@Library("lib")
import org.wso2.Utilities

def utils = new Utilities(this)

//Nodes
def NODE_MASTER = "master"
//Stages
def STAGE_SETUP_ENV = "Setup Environment"
def STAGE_BUILD_PACK = "Build the pack"

node(NODE_MASTER) {


    //This stage is responsible for cloning required resources from GitHub
    stage(STAGE_SETUP_ENV) {
        info "ss"
    }

    /*
    This stage is responsible for getting updates and applying the configuration
     */
    stage(STAGE_BUILD_PACK){

    }


    stage("utiu") {

        try {
            sh './ss.sh'
        } catch (ee) {
            throw ee
        }


        echo "$out"
        utils.color()
    }
    ansiColor('xterm') {
        stage("\u001B[31mI'm Red\u001B[m Now not") {
            echo "Hello \u001B[31mRed\u001B[m"

        }


    }


}