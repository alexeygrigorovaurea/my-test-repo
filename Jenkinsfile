pipeline {
    agent any
    stages {
        stage('build') {
            tools maven
            steps {
                sh 'mvn --version'
                sh 'test.sh'
            }
        }
    }
}
