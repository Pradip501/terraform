pipeline {
    agent any 
    stages {
        stage('Pull') { 
            steps {
                git 'https://github.com/rajatpzade/studentapp.ui.git'
            }
        }
        stage('Build') { 
            steps {
               sh 'echo Build stage successfully run'
            }
        }        
        stage('Test') { 
            steps {
                sh 'echo Test stage successfully run'
            }
        }
        stage('Deploy') { 
            steps {
                sh 'echo Deploy stage successfully run' 
            }
        }
    }
}
