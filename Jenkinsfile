pipeline {
  agent any
  stages {
    stage('test') {
      agent any
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