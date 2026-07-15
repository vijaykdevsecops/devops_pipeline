pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'D:/DevOps/sample_project/devops_pipeline'
            }
        }

        stage('Build') {
            steps {
                sh 'javac HelloDevOps.java'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQubeServer') {
                    sh 'mvn sonar:sonar'
                }
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t hello-devops -f Docker_file_HelloDevOps .'
            }
        }

        stage('Helm Deploy') {
            steps {
                sh 'helm upgrade --install hello-devops ./helm-chart'
            }
        }
    }
}
