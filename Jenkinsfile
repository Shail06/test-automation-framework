pipeline {
  agent {
    docker {
      image '3.6.0-jdk-8-alpine'
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