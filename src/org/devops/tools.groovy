package org.devops

//构建类型

def build(buildType,buildShell){
    def buildTools = ["mvn":"M3","ant":"ANT","gradle":"GRADLE","npm":"NPM"]
    
    println("请选情当前构建的类型为: ${bulidType}")
    buildHome = tool buildTools[buildType]
    
    sh "${buildHome}/bin/${buildType} ${buildShell}"
}
