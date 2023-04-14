def call(String imageName, String imageTag, String dockerHubUser) {
    sh 'docker build -t $(dockerHubUser)/$(imageName) .'
    sh 'docker image tag $(dockerHubUser)/$(imageName) $(dockerHubUser)/$(imageName):$(imageTag)'
    sh  'docker image tag $(dockerHubUser)/$(imageName) $(dockerHubUser)/$(imageName):latest'
}