pipelne{
   
   agent any
   stages{
       stage('build'){
           
           steps{
               bat 'mvn -version'
           }

       }
       stage('compile'){
           
           steps{
               bat 'mvn clean'
           }

       }
       stage('Test'){
           
           steps{
               bat 'mvn test'
           }

       }

       
   }

    
}
