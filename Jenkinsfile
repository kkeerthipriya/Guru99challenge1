/* Requires the Docker Pipeline plugin */

pipeline {
    agent any
    stages {
            stage('Initialize'){
        steps {
                def dockerHome = tool 'myDocker'
                env.PATH = "${dockerHome}/bin:${env.PATH}"                
        }
        }
        stage('Run Test Automation Suite') {
            steps {
                sh 'mvn clean verify'
            }
        }
    }
}
