#!groovy
@Library('jenkins-sharelibary') _
def tools = new org.devops.tools()


pipeline {
    agent { node {label "node1"}}
    parameters { string(name: 'DEPLOY_ENV',defaultValue:'string',description:'nishishabi')}
    stages{
        stage("No.1"){
            steps{
                echo "Hello World"
                input id: 'Test', message: '是否继续?', ok: '是', parameters: [choice(choices: ['a', 'b'], description: '', name: 'test')], submitter: 'admin'
            }
        }
        stage("No.2"){
            steps{
                script{
                    println("shabi")
                    println("${dzy}")
                    tools.PrintMes("this is my libary")
            }
        }
    }
        stage("bingxing"){
            failFast true
            parallel{
                stage("No.1"){
                    steps{
                        echo "Hello World"
                    }
                }
                stage("No.2"){
                    steps{
                        script{
                            println("shabi")
                            println("${dzy}")
                        }
                    }
                }
            }
        }
    }
    post{
        always {
            script{
                println("always")
                }
            }
        }
    }
