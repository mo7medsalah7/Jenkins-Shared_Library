def call(String imageName, String imageTag, String dokerUser) {
withCredentials([usernamePassword(credentialsId: 'docker-cred', passwordVariable: 'PASSWORD', usernameVariable: 'USERNAEM')]) {
   sh "docker login -u '$USERNAEM' -p '$PASSWORD' "
}
    sh "docker image push ${dokerUser}/${imageName}:${imageTag}"
    sh "docker image push ${dokerUser}/${imageName}:latest"

}