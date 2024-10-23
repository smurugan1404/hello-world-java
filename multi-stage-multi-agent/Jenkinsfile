pipeline {
    agent {
        docker {
            image 'openjdk:17-jdk-alpine'
        }
    }

    stages {
        stage('Build') {
            steps {
                sh 'javac HelloWorld.java'
            }
        }
        stage('Run') {
            steps {
                sh 'java HelloWorld'
            }
        }
    }
}
