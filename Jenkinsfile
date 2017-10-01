pipeline {
    agent any
    tool 'maven'
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
		sh 'test.sh'
            }
        }
    }
}
