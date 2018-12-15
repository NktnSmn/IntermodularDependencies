package com.nktnsmn.intermodulardependencies

import android.app.Application
import com.nktnsmn.common.di.main.CommonMainDIComponent
import com.nktnsmn.communicator.mainDI.CommunicatorMainDIComponent
import com.nktnsmn.disk.mainDI.DiskMainDIComponent
import com.nktnsmn.intermodulardependencies.di.ModularDIComponentsManager
import com.nktnsmn.intermodulardependencies.di.ModularDIComponentsProvider

class IntermodularDependenciesApplication :
    Application(),
    ModularDIComponentsProvider {

    private val modularComponentsProvider: ModularDIComponentsProvider = ModularDIComponentsManager(this)

    //region ModularDIComponentsProvider
    override fun commonMainDIComponent(): CommonMainDIComponent =
        modularComponentsProvider.commonMainDIComponent()

    override fun diskMainDIComponent(): DiskMainDIComponent =
        modularComponentsProvider.diskMainDIComponent()

    override fun communicatorMainDIComponent(): CommunicatorMainDIComponent =
        modularComponentsProvider.communicatorMainDIComponent()
    //endregion
}