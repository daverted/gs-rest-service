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
        sh 'mvn test -Darguments=" \
              -Dtakipi.application.name=${JOB_NAME} \
              -Dtakipi.deployment.name=${BRANCH_NAME}-${BUILD_NUMBER} \
              -Dtakipi.server.name=Jenkins"'
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