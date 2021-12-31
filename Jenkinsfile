pipeline {
    agent any
    stages {
        stage('Clone Sources') {
            steps {
                git url: 'https://github.com/SyedSamsu/JenkinDemo.git'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                script{
                    withSonarQubeEnv('SonarQube') {
                        sh 'gradle sonarqube -Dsonar.projectKey=DemoJenkinPipeline -Dsonar.login=admin -Dsonar.password=#CAPss24 -Dsonar.sources=src -Dsonar.host.url=http://127.0.0.1:9000'
                    }
                }
            }
        }
        stage("Quality gate") {
            steps {
                waitForQualityGate abortPipeline: true
            }
        }
    }
}
