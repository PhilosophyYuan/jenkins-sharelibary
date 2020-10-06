@Library('jenkins-sharelibary@master') _
def build = new org.devops.build()
def deploy = new org.devops.deploy()
String buildShell = "${env.buildShell}"
String buildType = "${env.buildType}"
String deployHost = "${env.deployHost}"
String branchName= "${branchName}"
String srcUrl = "${srcUrl}"

pipeline{
    agent {node {label "node1"}}
    stages{
        stage("build"){
            steps("maven version"){
                script{
                    checkout([$class: 'GitSCM', branches: [[name: "${branchName}"]], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'gitlab', url: "${srcUrl}"]]])
                    deploy.ansibleDeploy("${deployHost}","-m ping")
                }
            }
        }
        stage("Build"){
            steps{
                script{
                    build.Build(buildType,buildShell)
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
