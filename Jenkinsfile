pipeline {
    agent any 
    stages {
        stage('-----Clean-----') { 
            steps {
                sh "mvn clean"
            }
        }
        stage('-----Test-----') { 
            steps {
                sh "mvn test"
            }
        }
        stage('----Result-----') { 
            steps {
                sh "mvn package"
            }
        }
    }
}
