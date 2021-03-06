#!groovy
// comment12
// Connecting to Server And check status
properties([disableConcurrentBuilds()])

pipeline {
    agent { 
        label 'master'
        }
    options {
        buildDiscarder(logRotator(numToKeepStr: '10', artifactNumToKeepStr: '10'))
        timestamps()
    }
    stages {
        stage("First step") {
            steps {
                sh 'ssh root@192.168.8.56.108 \'systemctl status sshd\''
            }
        }
        stage("Second step") {
            steps {
                sh 'ssh root@ub1 \'uptime\''
            }
        }
    }
}
