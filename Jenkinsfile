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

        stage('Build Image'){
            steps{
                bat 'docker build -t=topdandy/selenium-docker-test-v1 .'
            }
        }

        stage('Push Image'){
            environment{
                // assuming you have stored the credentials with this name
                DOCKER_HUB = credentials('dockerhub-credentials')
            }
            steps{
                bat 'docker login -u ${DOCKER_HUB_USR} -p ${DOCKER_HUB_PSW}'
                bat 'docker push topdandy/selenium-docker-test-v1'
            }
        }

    }

    post {
        always {
            bat 'docker logout'
        }
    }

}