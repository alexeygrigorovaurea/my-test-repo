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
            agent {
                docker 'maven:3-alpine'
            }
            steps {
                sh "echo hihi && chmod +x test.sh &&./test.sh"
                input 'pls accept'
            }
        }
    }
}
