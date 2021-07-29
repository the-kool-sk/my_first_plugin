package com.github.thekoolsk.myfirstplugin.services

import com.github.thekoolsk.myfirstplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
