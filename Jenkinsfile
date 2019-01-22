pipeline {
  agent any
  stages {
    stage('build') {
      agent any
      steps {
        sh 'source /etc/profile.d/maven.sh'
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