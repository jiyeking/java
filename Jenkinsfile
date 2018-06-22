pipeline {
    agent {
            docker {
                image 'maven:3-alpine'
                args '--privileged=true -v /root/.m2:/root/.m2 -v /root/.jenkins/workspace:/root/.jenkins/workspace'
            }
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
         stage('Test') {
                    steps {
                        sh 'mvn test'
                    }
                    post {
                       always {
                           junit 'target/surefire-reports/*.xml'
                       }
                    }
          }
         stage('Deliver') {
                      steps {
                          sh 'chmod 777 ./deliver.sh'
                          sh './deliver.sh'
                      }
         }
    }
}