pipeline {
    agent any
    stages {
        stage('build') {
            tools {
                maven 'maven3.5'
            }
            steps {
                sh 'mvn --version'
                sh 'chmod +x test.sh && ./test.sh'
            }
        } stage('Accept') {
            agent none
            steps {
                input 'pls accept'
            }
        }
    }
}
