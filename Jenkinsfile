pipeline {
  agent any
  // agent {
  //   dockerfile {
  //     filename 'Dockerfile'
  //     // args '--link collector:collector'
  //   }
  // }
  stages {
    // stage('Build') {
    //   steps {
    //     sh './mvnw package -DskipTests'
    //   }
    // }
    // stage('Test') {
    //   environment {
    //     TAKIPI_SERVER_NAME = 'Jenkins'
    //   }
    //   steps {
    //     sh 'env'
    //     sh './mvnw -DargLine="-Dtakipi.application.name=${JOB_NAME} -Dtakipi.deployment.name=v0.1.0-${BUILD_NUMBER}" test'
    //   }
    // }
    stage('OverOps') {
      steps {
        echo "OverOps Reliability Report: ${BUILD_URL}OverOpsReport/"
        OverOpsQuery(
          applicationName: '${JOB_NAME}',
          deploymentName: '',
          // deploymentName: 'v0.1.0-${BUILD_NUMBER}',
          activeTimespan: 10080,
          baselineTimespan: 20160,
          criticalExceptionTypes: 'NullPointerException,IndexOutOfBoundsException,InvalidCastException,AssertionError',
          minVolumeThreshold: 1,
          minErrorRateThreshold: 1,
          regressionDelta: 0.5,
          criticalRegressionDelta: 1,
          applySeasonality: false,
          markUnstable: true,
          showResults: true,
          printTopIssues: 10,
          maxErrorVolume: 1,
          maxUniqueErrors: 1,
          regexFilter: '"type":\\"*(Timer|Logged Warning)',
          verbose: false,
          serverWait: 60,
          serviceId: 'S37777'
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