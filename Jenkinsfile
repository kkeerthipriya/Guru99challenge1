node {
    
  stage 'Checkout'
  //git 'https://github.com/kulinski/jenkins-docker-maven-example.git'
  // shortcut to checkout from where this Jenkinsfile is hosted
  checkout scm

  stage 'Build and Test'
  // Build using a plain docker container, not our local Dockerfile
  def mvnContainer = docker.image('jimschubert/8-jdk-alpine-mvn')
  mvnContainer.inside('-v /m2repo:/m2repo') {
      // Set up a shared Maven repo so we don't need to download all dependencies on every build.
      writeFile file: 'settings.xml',
         text: '<settings><localRepository>/m2repo</localRepository></settings>'
      
      // Build with maven settings.xml file that specs the local Maven repo.
      sh 'mvn -B -s settings.xml clean verify'
   }
}
