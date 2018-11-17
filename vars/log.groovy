def info(message) {
    ansiColor('xterm') {
        echo "INFO: ${message}"
    }

}

def warning(message) {
    echo "WARNING: ${message}"
}