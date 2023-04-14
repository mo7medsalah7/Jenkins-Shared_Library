def call(String imageName, String imageTag, String dokerUser) {
    sh """
        docker image build -t ${dokerUser}/${imageName} ./spring-boot-app/
        docker image tag ${dokerUser}/${imageName} ${dokerUser}/${imageName}:${imageTag}
        docker image tag ${dokerUser}/${imageName} ${dokerUser}/${imageName}:latest
    """
}