pipeline {
    agent none
    stages {
        stage('build') {
            agent any
            tools {
                maven 'maven3.5'
            }
            steps {
                sh 'mvn --version'
                sh 'chmod +x test.sh && ./test.sh'
            }
        }
        stage('Accept') {
            agent none
            steps {
                sh "echo hi"
                input 'pls accept'
            }
        }
    }
}
