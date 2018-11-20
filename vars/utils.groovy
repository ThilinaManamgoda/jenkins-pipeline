def cloneRepo(directory, repoUrl) {
    dir(directory) {
        checkout([$class    : 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false,
                        extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: repoUrl]]])
    }
}