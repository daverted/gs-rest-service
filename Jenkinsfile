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
        TAKIPI_SERVER_NAME = 'Jenkins'
      }
      steps {
        sh 'env'
        sh 'mvn -DargLine="-Dtakipi.application.name=${JOB_NAME} -Dtakipi.deployment.name=v0.1.0-${BUILD_NUMBER}" test'
      }
    }
    stage('OverOps') {
      steps {
        OverOpsQuery(
          applicationName: '${JOB_NAME}',
          deploymentName: '',
          // deploymentName: 'v0.1.0-${BUILD_NUMBER}',
          activeTimespan: 180,
          baselineTimespan: 10080,
          criticalExceptionTypes: 'NullPointerException,IndexOutOfBoundsException,InvalidCastException,AssertionError',
          minVolumeThreshold: 1,
          minErrorRateThreshold: 1,
          regressionDelta: 0.5,
          criticalRegressionDelta: 1,
          applySeasonality: false,
          markUnstable: true,
          showResults: true,
          printTopIssues: 10,
          maxErrorVolume: 0,
          maxUniqueErrors: 0,
          regexFilter: '"type":\\"*(Timer|Logged Warning)',
          verbose: true,
          serverWait: 60,
          serviceId: 'S37529'
        )
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