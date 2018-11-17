def info(message) {

    wrap([$class: 'AnsiColorBuildWrapper', 'colorMapName': 'XTerm']) {
        sh 'echo "\\u001b[31mINFO: ${message}"'
    }

}

def warning(message) {
    echo "WARNING: ${message}"
}