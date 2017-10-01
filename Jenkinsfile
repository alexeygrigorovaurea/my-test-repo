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
            agent any
            steps {
                sh "echo hihi &&./test.sh"
                input 'pls accept'
            }
        }
    }
}
