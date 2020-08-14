pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
               javac HelloWorld.java
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
