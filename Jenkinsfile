pipeline {
  agent {
    docker {
      image 'maven:3.6.0-jdk-10-slim'
    }

  }
  stages {
    stage('test') {
      agent {
        docker {
          image '3.6.0-jdk-8-alpine'
        }

      }
      steps {
        sh 'mvn --version'
      }
    }
    stage('finish') {
      steps {
        echo 'Finish'
      }
    }
  }
}