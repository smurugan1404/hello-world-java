
pipeline {
    agent any 
    environment {
        GIT_URL="https://github.com/sanagamesh/hello-world-java"
        GIT_CREDENTAILSID='jenkins'
        GIT_BRANCH='master'
    }
    stages {
        stage('Build') { 
            steps {
                echo "Enterd the build stage: "
                echo "${env.GIT_URL}"
            }
        }
        stage('Test') { 
            steps {
                echo "TESTING"
                echo "test complete"
            }
        }
        stage('Deploy') { 
            steps {
                echo "TESTING"
                sh 'java HelloWorld.java'
            }
        }
    }
}
