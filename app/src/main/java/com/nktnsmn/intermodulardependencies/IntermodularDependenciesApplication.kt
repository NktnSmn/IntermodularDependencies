package com.nktnsmn.intermodulardependencies

import android.app.Application
import com.nktnsmn.common.di.main.CommonMainDIComponent
import com.nktnsmn.disk.mainDI.DiskMainDIComponent
import com.nktnsmn.intermodulardependencies.di.app.AppDIComponent
import com.nktnsmn.intermodulardependencies.di.app.companion.AppDIComponentBuilder
import com.nktnsmn.intermodulardependencies.di.app.companion.AppDIComponentProvider
import com.nktnsmn.intermodulardependencies.di.modular.ModularDIComponentsProvider
import com.nktnsmn.messenger.mainDI.MessengerMainDIComponent

class IntermodularDependenciesApplication :
    Application(),
    AppDIComponentProvider,
    ModularDIComponentsProvider {

    private val appDIComponent: AppDIComponent = AppDIComponentBuilder(this).buildComponent()

    //region AppDIComponentProvider
    override fun appDIComponent(): AppDIComponent = appDIComponent
    //endregion

    //region ModularDIComponentsProvider
    override fun commonMainDIComponent(): CommonMainDIComponent =
        appDIComponent.commonMainDIComponent()

    override fun diskMainDIComponent(): DiskMainDIComponent =
        appDIComponent.diskMainDIComponent()

    override fun messengerMainDIComponent(): MessengerMainDIComponent =
        appDIComponent.messengerMainDIComponent()
    //endregion
}