package com.nktnsmn.intermodulardependencies.di

import android.app.Application
import com.nktnsmn.common.di.main.CommonMainDIComponent
import com.nktnsmn.communicator.mainDI.CommunicatorMainDIComponent
import com.nktnsmn.disk.mainDI.DiskMainDIComponent

class ModularDIComponentsManager(application: Application) : ModularDIComponentsProvider {

    private val componentsBuilder = ModularDIComponentsBuilder(application)
    private val commonMainDIComponent = componentsBuilder.buildCommonMainDIComponent()
    private val diskMainDIComponent = componentsBuilder.buildDiskMainDIComponent(commonMainDIComponent)
    private val communicatorMainDIComponent = componentsBuilder.buildCommunicatorMainDIComponent(commonMainDIComponent)

    override fun commonMainDIComponent(): CommonMainDIComponent = commonMainDIComponent

    override fun diskMainDIComponent(): DiskMainDIComponent = diskMainDIComponent

    override fun communicatorMainDIComponent(): CommunicatorMainDIComponent = communicatorMainDIComponent
}