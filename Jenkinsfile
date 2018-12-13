pipeline {
  agent {
    dockerfile true
    args '--link collector:collector'
  }
  stages {
    stage('Build') {
      steps {
        sh 'mvn package'
      }
    }
    stage('Test') {
      environment {
        MAVEN_OPTS = "$MAVEN_OPTS -agentpath:$TAKIPI_AGENT_HOME/lib/libTakipiAgent.so"
      }
      steps {
        sh 'echo "-----------"'
        sh 'env'
        sh 'echo "-----------"'
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