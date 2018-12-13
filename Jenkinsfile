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
        TAKIPI_APPLICATION_NAME = ${JOB_NAME}
        TAKIPI_SERVER_NAME = 'Jenkins'
      }
      steps {
        sh 'env'
        sh 'mvn -Darguments=-Dtakipi.deployment.name=v0.1.${BUILD_NUMBER} test'
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