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
                cd 'C:\Users\sanka\Learn\terraform\terraform1\"
                bat(/"C:\Users\sanka\Learn\terraform\terraform" plan -var-file="C:\/Users\/sanka\/Learn\/terraform\/terraform.tfvars"/)

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
