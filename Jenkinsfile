pipeline {
  agent {
    docker {
      image 'maven:3.6.0-jdk-10-slim'
    }

  }
  stages {
    stage('build') {
      steps {
        sh 'mvn clean verify'
      }
    }
    stage('finish') {
      steps {
        echo 'Finished!!'
      }
    }
  }
}
