pipeline {
  agent any
  stages {
    stage('test') {
      agent {
        docker {
          image 'maven:3.3-jdk-8'
        }

      }
      steps {
        sh 'mvn clean verify'
      }
    }
    stage('finish') {
      steps {
        echo 'Done'
      }
    }
  }
}