pipeline {
  agent any
  stages {
    stage('test') {
      agent {
        docker {
          image 'maven:3.6.0-jdk-10-slim'
        }

      }
      steps {
        sh 'mvn clean verify'
      }
    }
    stage('finish') {
      steps {
        echo 'Finish'
      }
    }
  }
}