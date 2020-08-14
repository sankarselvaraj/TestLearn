pipeline {
    agent any
    environment {
        TF_WORKSPACE = 'terraform1'
    }
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
                bat(/"C:\Users\sanka\Learn\terraform\terraform" init C:\windows\System32\config\systemprofile\AppData\local\Jenkins.jenkins\workspace\TestGitPull_TestLearn_master\/)
                bat(/"C:\Users\sanka\Learn\terraform\terraform" plan -var-file=C:\Users\sanka\Learn\terraform\terraform.tfvars -out=C:\windows\System32\config\systemprofile\AppData\local\Jenkins.jenkins\workspace\TestGitPull_TestLearn_master\terraform.tfstate C:\windows\System32\config\systemprofile\AppData\local\Jenkins.jenkins\workspace\TestGitPull_TestLearn_master\)
                bat(/"C:\Users\sanka\Learn\terraform\terraform" apply -auto-approve C:\windows\System32\config\systemprofile\AppData\local\Jenkins.jenkins\workspace\TestGitPull_TestLearn_master\terraform.tfstate/)
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
