def info(message) {

    ansiColor('xterm') {
        echo "\\u001B[31mI\'m Red\\u001B[0m Now not"
        echo "TERM=${env.TERM}"
    }

}

def warning(message) {
    echo "WARNING: ${message}"
}