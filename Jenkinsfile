pipeline {
    agent any 
    stages {
        stage('-----Clean-----') { 
            steps {
                javac Employee.java
            }
        }
        stage('-----Test-----') { 
            steps {
                java Employee
            }
        }
        stage('----Result-----') { 
            steps {
                echo "Success"
            }
        }
    }
}
