pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''cd www
./gradlew build'''
      }
    }
  }
}