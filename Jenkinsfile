pipeline {
  agent any
  stages {
    stage('build') {
      agent any
      steps {
        sh '''/bin/bash
source /etc/profile.d/maven.sh'''
      }
    }
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