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
      steps {
        sh 'mvn -Dtakipi.application.name=${JOB_NAME} -Dtakipi.deployment.name=${BUILD_NUMBER} test'
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