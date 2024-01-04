def call(String repoUrl){
    pipeline {
       agent any
       stages {
           stage("Tools initialization") {
               steps {
                   echo 'we are practising'
                   sh 'java -version'
               }
           }
           stage("Checkout Code") {
               steps {
                   git branch: 'main',
                          url: "${repoUrl}"
               }
           }
           stage("to-test-maven") {
               steps {
                   sh 'lsblk'
               }
           }
       }
}
}
