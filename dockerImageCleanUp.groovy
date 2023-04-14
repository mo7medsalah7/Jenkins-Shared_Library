def call(String imageName, String imageTag, String dokerUser) {

    sh """
        docker rmi ${dokerUser}/${imageName}:${imageTag}
        docker rmi ${dokerUser}/${imageName}:latest
    """

}