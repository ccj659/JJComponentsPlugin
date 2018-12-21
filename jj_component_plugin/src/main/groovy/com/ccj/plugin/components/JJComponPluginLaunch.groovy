package com.ccj.plugin.components

import org.gradle.api.Plugin
import org.gradle.api.Project;

public class JJComponPluginLaunch implements Plugin<Project> {
    @Override
    void apply(Project project) {
        JJCLogger.make(project)
        JJCLogger.i('Project enable MyPluginLaunch plugin')

        project.extensions.create("appComponInfo",AppComponInfo)        //创建扩展属性
        project.tasks.create("appComponTask",AppComponTask) //创建自定义任务



    }
}
