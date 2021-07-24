package com.github.atishikawa.intellijpluginkeymapemacsmacos.services

import com.github.atishikawa.intellijpluginkeymapemacsmacos.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
