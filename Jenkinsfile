pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        bat 'gradle clean build'
      }
    }
    stage('Test') {
      steps {
        bat 'gradle clean test'
      }
    }
  }
}