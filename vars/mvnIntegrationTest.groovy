def call() {
    sh 'mvn verify -f ./spring-boot-app/pom.xml -DskipUnitTests'
}