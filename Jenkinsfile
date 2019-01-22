pipeline {
  agent any
  stages {
    stage('test') {
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