@Library("lib")

import org.wso2.Utilities
def utils = new Utilities(this)


//Nodes
def NODE_MASTER = "master"
//Stages
def STAGE_SETUP_ENV = "Setup Environment"
def STAGE_BUILD_PACK = "Build the pack"
def STAGE_BUILD_IMAGE = "Build the immutable image"
def STAGE_DEPLOY_STAGING = "Deploy to Staging"
def STAGE_RUNNING_TESTS = "Running Tests"
def STAGE_DEPLOY_PRODUCTION = "Deploy to Production"

env.BUILD_PACK_LOC = "/home/jenkins"

node(NODE_MASTER) {

    //This stage is responsible for cloning required resources from GitHub
    stage(STAGE_SETUP_ENV) {
        log.info "ss"
    }

    /*
    This stage is responsible for getting updates and applying the configuration
     */
    stage(STAGE_BUILD_PACK) {

    }

    stage(STAGE_BUILD_IMAGE) {
       def AMI = utils.create()
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