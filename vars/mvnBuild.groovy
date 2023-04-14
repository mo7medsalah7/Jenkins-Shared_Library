def call() {
    sh 'mvn clean -f ./spring-boot-app/pom.xml install'
}