def call(dest) {
    sh 'mvn -f $dest test'
}