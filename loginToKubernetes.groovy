def call(String login_credentials) {
    sh """
        ssh -o StrictHostKeyChecking=no ${login_credentials}


    """
}