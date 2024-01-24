node{
    stage('code checkout'){
        git 'https://github.com/ChandanTeekinavar/php-registration-form-test-cases.git'
    }
    
    stage('build test scripts'){
        sh 'mvn clean package'
    }
    
    stage('run test scripts'){
        sh 'java -jar target/php-registration-test-cases-jar-with-dependencies.jar'
    }
    
}
