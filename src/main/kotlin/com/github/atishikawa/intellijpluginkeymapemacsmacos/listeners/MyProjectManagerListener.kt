package com.github.atishikawa.intellijpluginkeymapemacsmacos.listeners

import com.github.atishikawa.intellijpluginkeymapemacsmacos.services.MyProjectService
import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener

internal class MyProjectManagerListener : ProjectManagerListener {

    override fun projectOpened(project: Project) {
        project.service<MyProjectService>()
    }
}
