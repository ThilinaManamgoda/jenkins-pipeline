package org.wso2

class Utilities implements Serializable {
    def steps
    Utilities(steps) {this.steps = steps}
    def color() {
        steps.ansiColor('xterm') {
            steps.echo "\\u001B[31mI\'m Red\\u001B[0m Now not"
        }
    }
}
