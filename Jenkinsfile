pipeline {
    agent any
    environment {
        JAVA_HOME = 'C:\\Java\\jdk-21'  // replace with your JDK path
        PATH = "${JAVA_HOME}\\bin;${env.PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/udayn32/DSAJava.git', branch: 'main'
            }
        }
        stage('Build & Test') {
            steps {
                bat 'mvn clean install test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Running Java application...'
                bat 'java -jar target/DSAJava-1.0-SNAPSHOT.jar'
            }
        }
    }
    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
