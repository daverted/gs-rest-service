pipeline {
  agent {
    dockerfile {
      filename 'Dockerfile'
      args '--link collector:collector'
    }
  }
  stages {
    stage('Build') {
      steps {
        sh 'mvn package -DskipTests'
      }
    }
    stage('Test') {
      environment {
        MAVEN_OPTS = "-agentpath:/takipi/lib/libTakipiAgent.so"
      }
      steps {
        sh 'env'
        sh 'mvn test'
      }
    }
    stage('Publish') {
      steps {
        sh 'echo "TODO"'
      }
    }
    stage('Deploy') {
      steps {
        sh 'echo "TODO"'
      }
    }
  }
}