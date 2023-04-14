def call(dest) {
    sh 'mvn -Dtest=$dest test'
}