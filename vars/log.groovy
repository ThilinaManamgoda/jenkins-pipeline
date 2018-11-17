def info(message) {

    wrap([$class: 'AnsiColorBuildWrapper', 'colorMapName': 'XTerm']) {
        sh 'echo "INFO: ${message}"'
        echo '\\u001B[31mI\'m Red\\u001B[0m Now not'
    }

}

def warning(message) {
    echo "WARNING: ${message}"
}