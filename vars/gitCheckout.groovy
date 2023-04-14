def call(Map stageParams) {
    checkout({
        $class: 'SCMGit'
        branches: [{name: stageParams.branch}]
        userRemoteConfigs: [[ url: stageParams.url ]]
    })
}