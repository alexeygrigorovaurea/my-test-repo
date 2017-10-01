pipeline {
    agent any
    stages {
        stage('build') {
            tools {
                maven 'maven3.5'
            }
            steps {
                sh 'mvn --version'
                sh 'test.sh'
            }
        }
    }
}
