pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat(/"C:\Program Files\Java\jdk-11.0.2\bin\javac" HelloWorld.java/)
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                bat(/"C:\Program Files\Java\jdk-11.0.2\bin\java" HelloWorld/)
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                bat(/"cd C:\Users\sanka\Learn\terraform\terraform1\"/)


            }
        }
        stage('Verification') {
            steps {
                echo 'Post deployment test...'
                bat(/"C:\Program Files\Java\jdk-11.0.2\bin\java" HelloWorld/)
            }
        }
    }
}
