pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/udayn32/DSAJava.git', branch: 'main'
            }
        }
        stage('Build & Test') {
            steps {
                withMaven(maven: 'Maven 3.9.11') {
                    bat 'mvn clean install test'
                }
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
