pipeline{

    agent any

    environment {
        NUMBER = 3
    }

    stages{

        stage('stage-1'){
            steps{
                echo "doing mvn clean"
                echo "NUMBER = ${NUMBER}"
            }
        }

        stage('stage-2'){
            environment {
                NUMBER = 6
            }
            steps{
               echo "NUMBER = ${NUMBER}"
            }
        }

         stage('stage-3'){
            steps{
               echo "NUMBER = ${NUMBER}"
            }
        }
    }

    post {
        always {
            echo "doing clean up"
        }
    }

}