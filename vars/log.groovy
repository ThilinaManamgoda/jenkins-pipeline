def info(message) {

    wrap([$class: 'AnsiColorBuildWrapper', 'colorMapName': 'XTerm']) {
        sh 'echo "INFO: ${message}"'
    }

}

def warning(message) {
    echo "WARNING: ${message}"
}