pipeline {
    agent { docker 'maven:3.3.3' }
    stages {
        stage('build') {
            steps {
		checkout scm
                sh 'mvn --version'
		sh 'test.sh'
            }
        }
    }
}
