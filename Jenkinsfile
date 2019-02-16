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
          applicationName: 'OverOps',
          deploymentName: 'v4.30.0',
          // applicationName: '${JOB_NAME}',
          // deploymentName: 'v0.1.0-${BUILD_NUMBER}',

          serviceId: 'S37777',

          regexFilter: '"type":\\"*(Timer|Logged Warning)',

          markUnstable: true,

          printTopIssues: 5,

          // verbose: false, **REMOVED** --> NOW "debug"
          // showResults: true, **REMOVED**
          // serverWait: 60, **REMOVED**

          checkNewErrors: null,
          newEvents: true,

          checkResurfacedErrors: null,
          resurfacedErrors: true,

          checkVolumeErrors: null,
          maxErrorVolume: 1,

          checkUniqueErrors: null,
          maxUniqueErrors: 1,

          checkCriticalErrors: null
          criticalExceptionTypes: 'NullPointerException,IndexOutOfBoundsException,InvalidCastException,AssertionError', // newly nested under check critical errors

          checkRegressionErrors: null,
          activeTimespan: '10080', // NOW A STRING (timespan in minutes)
          baselineTimespan: '20160', // NOW A STRING (timespan in minutes)
          minVolumeThreshold: 1,
          minErrorRateThreshold: 1,
          regressionDelta: 0.5,
          criticalRegressionDelta: 1,
          applySeasonality: false,

          debug: true
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