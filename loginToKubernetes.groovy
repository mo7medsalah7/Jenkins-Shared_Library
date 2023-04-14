def call(String loginCredentials) {
    sh """
        ssh -o StrictHostKeyChecking=no ${loginCredentials}


    """
}