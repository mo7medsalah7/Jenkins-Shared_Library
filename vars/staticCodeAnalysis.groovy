def call(credentialsId) {
    withSonarQubeEnv(credentialsId: credentialsId) {
        sh 'mvn clean -f ./spring-boot-app/pom.xml package sonar:sonar'
    }
}