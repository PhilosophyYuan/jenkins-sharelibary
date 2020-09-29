@Library('jenkins-sharelibary') _
def build = new devops.org.build()
String buildShell = "${env.buildShell}"

pipeline{
    agent {node {label "node1"}}
    stages{
        stage("build"){
            steps("maven version"){
                script{
                    mvnHome= tool "M2"
                    sh "${mvnHome}/bin/mvn ${buildShell}"
                }
            }
        }
        stage("antbuild"){
            steps("antBuild"){
                script{
                    try{
                    antHome = tool "ANT"
                    sh "${antHome}/bin/ant ${buildShell}"
                    } catch(e){
                        println(e)
                    }
                }
            }
        }
        stage("Gradle Build"){
            steps("Gradle Build"){
                script{
                    gradleHome = tool "GRADLE"
                    sh "${gradleHome}/bin/gradle ${buildShell}"
                }
            }
        }
    }
}
