def call() {
    sh 'mvn clean -f ./spring-boot-app/pom.xml package sonar:sonar'
}