pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat(/{$JAVA_HOME}\bin\javac" HelloWorld.java/)
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
