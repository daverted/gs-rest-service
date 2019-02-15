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
        OverOpsQuery(
          applicationName: '${JOB_NAME}',
          deploymentName: '',
          // deploymentName: 'v0.1.0-${BUILD_NUMBER}',

          serviceId: 'S37777',

          regexFilter: '"type":\\"*(Timer|Logged Warning)',

          markUnstable: true,

          printTopIssues: 5,

          // verbose: false, **REMOVED** --> NOW "debug"
          // showResults: true, **REMOVED**
          // serverWait: 60, **REMOVED**

          checkNewErrors: {foo:'bar'}, // must be set for newEvents
          newEvents: true,  // does nothing, but must be set

          checkResurfacedErrors: {foo:'bar'}, // must be set for resurfacedErrors
          resurfacedErrors: true, // does nothing, but must be set

          checkVolumeErrors: {foo:'bar'}, // must be set for maxErrorVolume
          maxErrorVolume: 1,

          checkUniqueErrors: {foo:'bar'}, // must be set for maxUniqueErrors
          maxUniqueErrors: 1,

          checkCriticalErrors: {foo:'bar'}, // must be set for checkCriticalErrors
          criticalExceptionTypes: 'NullPointerException,IndexOutOfBoundsException,InvalidCastException,AssertionError', // newly nested under check critical errors

          checkRegressionErrors: {foo:'bar'}, // must be set for the 7 settings below
          activeTimespan: '10080', // NOW A STRING (timespan in minutes)
          baselineTimespan: '20160', // NOW A STRING (timespan in minutes)
          minVolumeThreshold: 1,
          minErrorRateThreshold: 1,
          regressionDelta: 0.5,
          criticalRegressionDelta: 1,
          applySeasonality: false,

          debug: false
        )
        echo "OverOps Reliability Report: ${BUILD_URL}OverOpsReport/"
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