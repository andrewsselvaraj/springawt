pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/andrewsselvaraj/springawt.git'
            }
        }
        
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        
        stage('Deploy') {
            steps {
                withMaven(
                    // Maven settings.xml file containing credentials for the repository..
                    mavenSettingsConfig: 'maven-settings',
                    // Maven options to use when building and deploying the artifact
                    options: [
                        '-DskipTests=true',
                        '-Dmaven.javadoc.skip=true',
                        '-B', '-V'
                    ],
                    // Maven goals to execute
                    maven: 'maven-3.8.3'
                ) {
                    sh 'mvn deploy'
                }
            }
        }
    }
}
