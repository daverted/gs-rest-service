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
          activeTimespan: '10080',
          baselineTimespan: '20160',
          criticalExceptionTypes: 'NullPointerException,IndexOutOfBoundsException,InvalidCastException,AssertionError',
          minVolumeThreshold: 1,
          minErrorRateThreshold: 1,
          regressionDelta: 0.5,
          criticalRegressionDelta: 1,
          applySeasonality: false,
          markUnstable: true,
          // showResults: true, **REMOVED**
          printTopIssues: 10,
          maxErrorVolume: 1,
          maxUniqueErrors: 1,
          regexFilter: '"type":\\"*(Timer|Logged Warning)',
          // verbose: false, **REMOVED**
          // serverWait: 60, **REMOVED**
          serviceId: 'S37777',

          // ↓ NEW ↓
          checkNewErrors: {}, // must be set for newEvents
          newEvents: true,  // does nothing, but must be set

          checkResurfacedErrors: {} // must be set for resurfacedErrors
          resurfacedErrors: true, // does nothing, but must be set

          checkVolumeErrors: { maxErrorVolume: "0" }
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