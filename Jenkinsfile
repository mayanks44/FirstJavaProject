pipeline {
    agent any 
    stages {
        stage('-----Clean-----') { 
            steps {
                mvn clean
            }
        }
        stage('-----Test-----') { 
            steps {
                mvn test
            }
        }
        stage('Package') { 
            steps {
                mvn package
            }
        }
    }
}
