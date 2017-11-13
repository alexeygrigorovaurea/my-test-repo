pipeline {
    agent any
    stages {
        stage('test') {

            steps {
		sh 'ls -lah'
            }
        }
    }
    post {
        always {
            script {
                step([$class: 'XUnitBuilder',
                      thresholds: [[$class: 'FailedThreshold', failureThreshold: '1']],
                      tools: [[$class: 'UnitTestJunitHudsonTestType', pattern: '*.xml']]])
            }
        }
    }
}