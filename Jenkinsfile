pipeline {
  agent any
  stages {
    stage('test') {
      agent any
      steps {
        sh 'mvn --version'
      }
    }
    stage('finish') {
      steps {
        echo 'Done'
      }
    }
  }
}