/*
    Note:

    Linux users use "sh" instead of "bat"
    For ex: sh 'docker build -t=topdandy/selenium-docker-test-v1 .'

    Do not use "topdandy" to push. Use your dockerhub account
*/
pipeline{

    agent any

    stages{

        stage('Build Jar'){
            steps{
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Push Image'){
            environment{
                SERVICE_CREDS = credentials('dockerhub-creds')
            }
            steps{
                bat 'echo "Service user is ${SERVICE_CREDS_USR}"'
                bat 'echo "Service password is ${SERVICE_CREDS_PSW}"'
                bat 'docker push topdandy/selenium-docker-test-v1'

                bat 'docker push topdandy/selenium-docker-test-v1:latest'
                bat "docker tag topdandy/selenium-docker-test-v1:latest topdandy/selenium-docker-test-v1:${env.BUILD_NUMBER}"
                bat "docker push topdandy/selenium-docker-test-v1:${env.BUILD_NUMBER}"
            }
        }

    post {
        always {
            bat 'docker logout'
        }
    }

}
}