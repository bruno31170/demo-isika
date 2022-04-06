pipeline {
    agent any

    stages {
        stage('Chekout') {
            steps {
                echo '== Cheakout projet =='
                git branch: "master", url: "https://github.com/bruno31170/demo-isika.git"
            }
        }
        stage('Compile') {
            steps {
                echo '== Compile projet =='
                sh "mvn clean compile"
            }
        }
        stage('Test') {
            steps {
                echo '== Test projet =='
                sh "mvn test"
            }
            
            post{
                success {
                    junit "target/surefire-reports/*.xml"
                }
            }
        }
        stage('Package') {
            steps {
                echo '== Package projet =='
                sh "mvn package -DskipTests"
            }
            
            post{
                always {
                    archiveArtifacts artifacts: "target/*.jar", fingerprint: true
                }
            }
        }
    }
}
