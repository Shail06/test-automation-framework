pipeline {
  agent any
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
        echo 'Done'
      }
    }
  }
}