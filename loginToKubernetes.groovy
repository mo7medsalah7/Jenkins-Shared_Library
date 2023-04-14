def call(String loginCredentials) {
    sh """
      [ -d ~/.ssh ] || mkdir ~/.ssh && chmod 0700 ~/.ssh
        ssh -o StrictHostKeyChecking=no ${loginCredentials}
    """
}