pipeline {
    agent any



    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/flosx-talca/saludapp.git'
            }
        }

        stage('Compile') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }

    post {
        success {
            echo '✅ The build was successful.'
        }
        failure {
            echo '❌ The build failed.'
        }
    }
}
