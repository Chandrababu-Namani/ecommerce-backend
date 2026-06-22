pipeline {

```
agent any

tools {
    maven 'Maven-3'
}

stages {

    stage('Checkout') {
        steps {
            git branch: 'main',
                url: 'https://github.com/Chandrababu-Namani/ecommerce-backend.git'
        }
    }

    stage('Build') {
        steps {
            sh 'mvn clean package'
        }
    }

    stage('Archive') {
        steps {
            archiveArtifacts artifacts: 'target/*.jar'
        }
    }

    stage('Docker Build') {
        steps {
            sh 'docker build -t ecommerce-backend:${BUILD_NUMBER} .'
        }
    }

    stage('Docker Images') {
        steps {
            sh 'docker images'
        }
    }
}
```

}
