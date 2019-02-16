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

          checkNewErrors: [ newEvents: true ],
          newEvents: true,

          checkResurfacedErrors: [ resurfacedErrors: true ],
          resurfacedErrors: true,

          checkVolumeErrors: [ maxErrorVolume: '1' ],
          maxErrorVolume: '1',

          checkUniqueErrors: [ maxUniqueErrors: '1' ],
          maxUniqueErrors: '1',

          checkCriticalErrors: [ criticalExceptionTypes: 'NullPointerException,IndexOutOfBoundsException,InvalidCastException,AssertionError' ],
          criticalExceptionTypes: 'NullPointerException,IndexOutOfBoundsException,InvalidCastException,AssertionError',

          checkRegressionErrors: [activeTimespan: '12h', baselineTimespan: '7d', minVolumeThreshold: '20', minErrorRateThreshold: '0.1', regressionDelta: '0.5', criticalRegressionDelta: '1', applySeasonality: true],
          activeTimespan: '12h',
          baselineTimespan: '7d',
          minVolumeThreshold: '1',
          minErrorRateThreshold: '1',
          regressionDelta: '0.5',
          criticalRegressionDelta: '1',
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