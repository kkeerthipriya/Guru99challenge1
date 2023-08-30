/* Requires the Docker Pipeline plugin */

pipeline {
    agent {
    docker {
            image 'maven:3.9.0'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Run Test Automation Suite') {
            steps {
                sh 'def dockerHome = tool "myDocker"'
                sh 'env.PATH = "${dockerHome}/bin:${env.PATH}"'
                sh 'mvn clean verify'
            }
        }
    }
}
