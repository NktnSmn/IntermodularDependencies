package com.nktnsmn.intermodulardependencies.di.modular

import android.app.Application
import com.nktnsmn.common.contract.di.CommonMainDIComponentBuilder
import com.nktnsmn.common.di.main.CommonMainDIComponent
import com.nktnsmn.messenger.contract.di.MessengerMainDIComponentBuilder
import com.nktnsmn.messenger.mainDI.MessengerMainDIComponent
import com.nktnsmn.disk.contract.di.DiskMainDIComponentBuilder
import com.nktnsmn.disk.mainDI.DiskMainDIComponent
import com.nktnsmn.intermodulardependencies.dependencies.declaration.ModularDependencies
import com.nktnsmn.intermodulardependencies.di.app.AppDIScope
import dagger.Module
import dagger.Provides

@Module
class ModularDIComponentsDIModule(private val application: Application) {

    @Provides
    @AppDIScope
    fun commonMainDIComponent(): CommonMainDIComponent = CommonMainDIComponentBuilder(application).buildComponent()

    @Provides
    @AppDIScope
    fun diskMainDIComponent(
        commonMainDIComponent: CommonMainDIComponent,
        modularDependencies: ModularDependencies
    ): DiskMainDIComponent =
        DiskMainDIComponentBuilder(commonMainDIComponent, modularDependencies).buildComponent()

    @Provides
    @AppDIScope
    fun messengerMainDIComponent(
        commonMainDIComponent: CommonMainDIComponent,
        modularDependencies: ModularDependencies
    ): MessengerMainDIComponent =
        MessengerMainDIComponentBuilder(commonMainDIComponent, modularDependencies).buildComponent()
}