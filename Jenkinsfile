pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat(/"C:\Program Files\Java\jdk-11.0.2\bin\javac HelloWorld.java"/)
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
