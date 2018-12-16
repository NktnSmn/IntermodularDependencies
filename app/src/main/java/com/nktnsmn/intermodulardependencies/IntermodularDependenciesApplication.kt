package com.nktnsmn.intermodulardependencies

import android.app.Application
import com.nktnsmn.common.di.main.CommonMainDIComponent
import com.nktnsmn.communicator.mainDI.CommunicatorMainDIComponent
import com.nktnsmn.disk.mainDI.DiskMainDIComponent
import com.nktnsmn.intermodulardependencies.di.app.AppDIComponent
import com.nktnsmn.intermodulardependencies.di.app.DaggerAppDIComponent
import com.nktnsmn.intermodulardependencies.di.app.ModularDIModule
import com.nktnsmn.intermodulardependencies.di.modular.ModularDIComponentsProvider

class IntermodularDependenciesApplication :
    Application(),
    ModularDIComponentsProvider {

    private val appDIComponent: AppDIComponent = buildAppDIComponent()

    private fun buildAppDIComponent(): AppDIComponent =
        DaggerAppDIComponent.builder().modularDIModule(ModularDIModule(this)).build()

    //region ModularDIComponentsProvider
    override fun commonMainDIComponent(): CommonMainDIComponent =
        appDIComponent.commonMainDIComponent()

    override fun diskMainDIComponent(): DiskMainDIComponent =
        appDIComponent.diskMainDIComponent()

    override fun communicatorMainDIComponent(): CommunicatorMainDIComponent =
        appDIComponent.communicatorMainDIComponent()
    //endregion
}