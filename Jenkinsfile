pipeline {
  agent {
    docker {
      image 'maven:3.6.0-jdk-10-slim'
    }

  }
  stages {
    stage('test') {
      steps {
        sh 'mvn clean install'
      }
    }
    stage('finish') {
      steps {
        echo 'Finish'
      }
    }
  }
}