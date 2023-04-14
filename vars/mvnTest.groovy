def call() {
    sh 'mvn -f ./spring-boot-app/pom.xml test'
}