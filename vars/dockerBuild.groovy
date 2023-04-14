def call(String project, String imageTag, String dokerUser) {
    sh '''
        docker image build -t $(dokerUser)/$(project) .
        docker image tag $(dokerUser)/$(project) $(dokerUser)/$(project):$(imageTag)
        docker image tag $(dokerUser)/$(project) $(dokerUser)/$(project):latest
    '''
}