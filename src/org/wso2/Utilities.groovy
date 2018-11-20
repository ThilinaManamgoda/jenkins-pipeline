package org.wso2

class Utilities implements Serializable {
    def steps
    def envs
    Utilities(steps) {this.steps = steps
    this.envs=steps.env
    }
}