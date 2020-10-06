package org.devops
def ansibleDeploy(hosts,funcs){
  sh "ansible ${funcs} ${hosts}"
  }
