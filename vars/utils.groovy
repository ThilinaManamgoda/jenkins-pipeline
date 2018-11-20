def cloneRepo(directory, repoUrl) {
    steps.dir(directory) {
        steps.checkout([$class    : 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false,
                        extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: repoUrl]]])
    }
}