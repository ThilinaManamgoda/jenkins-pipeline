@Library("lib")

//import org.wso2.Utilities
//def utils = new Utilities(this)


//Nodes
def NODE_MASTER = "master"
//Stages
def STAGE_SETUP_ENV = "Setup Environment"
def STAGE_BUILD_PACK = "Build the pack"
def STAGE_BUILD_IMAGE = "Build the immutable image"
def STAGE_DEPLOY_STAGING = "Deploy to Staging"
def STAGE_RUNNING_TESTS = "Running Tests"
def STAGE_DEPLOY_PRODUCTION = "Deploy to Production"
//Directories
def JENKINS_HOME="/home/jenkins"
env.BUILD_PACK_LOC = "$JENKINS_HOME"
def AMI

node(NODE_MASTER) {

    //This stage is responsible for cloning required resources from GitHub
    stage(STAGE_SETUP_ENV) {
        utils.cloneRepo("configs", "https://github.com/ThilinaManamgoda/wso2-ci-cd.git")
        sh "ls -l"
        log.info "ss"
    }

    /*
    This stage is responsible for getting updates and applying the configuration
     */
    stage(STAGE_BUILD_PACK) {

    }

    stage(STAGE_BUILD_IMAGE) {
        echo "$AMI"
    }

    stage(STAGE_DEPLOY_STAGING) {
        echo "$AMI"
    }

    stage(STAGE_RUNNING_TESTS) {

    }

    stage(STAGE_DEPLOY_PRODUCTION) {

    }

    stage(STAGE_RUNNING_TESTS) {

    }
}

