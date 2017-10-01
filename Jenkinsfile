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
                docker {
                    image 'maven:3-alpine'
                    withServer 'tcp://172.17.0.1:2375'
                }
            }
            steps {
                sh "echo hihi && chmod +x test.sh &&./test.sh"
                input 'pls accept'
            }
        }
    }
}
