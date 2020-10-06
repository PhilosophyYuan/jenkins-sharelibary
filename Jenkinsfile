@Library('jenkins-sharelibary@master') _
def build = new org.devops.build()
def deploy = new org.devops.deploy()
String deployHost = "$(env.deployHost)"
String buildShell = "${env.buildShell}"
String buildType = "${env.buildType}"

pipeline{
    agent {node {label "node1"}}
    stages{
        stage("build"){
            steps("maven version"){
                script{
                    build.Build(buildType,buildShell)
                    deploy.ansibleDeploy("${deployHost}","-m ping")
                }
            }
        }
        /*stage("antbuild"){
            steps("antBuild"){
                script{
                    try{
                    build.Build(buildType,buildShell)
                    } catch(e){
                        println(e)
                    }
                }
            }
        }
        stage("Gradle Build"){
            steps("Gradle Build"){
                script{
                    build.Build(buildType,buildShell)
                }
            }
        }*/
    }
}
