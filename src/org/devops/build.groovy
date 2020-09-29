packge org.devops
def Build(buildType,buildShell){
  def buildTools = ["mvn":"M2","ant":ANT,"gradle":"GRADLE","node":NODEJS]
  println("当前选择的构建类型为${buildType}")
  buildHome = tool buildTools[buildType]
  sh "${buildHome}/bin/${buildType} ${buildShell}"
}
