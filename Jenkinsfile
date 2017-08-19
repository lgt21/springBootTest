node {
    stage("checkout") {
        git 'https://github.com/lgt21/springBootTest.git'
    }
    stage("package") {
        sh 'mvn clean package'
    }
}