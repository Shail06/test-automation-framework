pipeline {
  agent {
    docker {
      image 'maven:3.6.0-jdk-10-slim'
    }

  }
  stages {
    stage('build') {
      steps {
        sh 'mvn clean'
      }
    }
    stage('test') {
      steps {
        sh 'mvn verify'
      }
    }
    stage('finish') {
      steps {
        echo 'Finished!!'
      }
    }
  }
}