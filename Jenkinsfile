node {
    docker.withServer('tcp://dlb1.aureacentral.com:2375', 'dlb1') {
        checkout scm
        docker.image('alpine').inside {
            stage('sayHello') {
                sh 'env'
                sh 'ls -lah'
            }
        }
    }
}