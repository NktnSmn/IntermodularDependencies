package com.nktnsmn.intermodulardependencies.di.modular

import android.app.Application
import com.nktnsmn.common.contract.di.CommonMainDIComponentBuilder
import com.nktnsmn.common.di.main.CommonMainDIComponent
import com.nktnsmn.communicator.contract.di.CommunicatorMainDIComponentBuilder
import com.nktnsmn.communicator.mainDI.CommunicatorMainDIComponent
import com.nktnsmn.disk.contract.di.DiskMainDIComponentBuilder
import com.nktnsmn.disk.mainDI.DiskMainDIComponent
import com.nktnsmn.intermodulardependencies.dependencies.modular.dependencies.ModularDependencies
import com.nktnsmn.intermodulardependencies.di.app.AppDIScope
import dagger.Module
import dagger.Provides

@Module
class ModularDIComponentsDIModule(private val application: Application) {

    @Provides
    @AppDIScope
    fun commonMainDIComponent(): CommonMainDIComponent = CommonMainDIComponentBuilder().buildComponent(application)

    @Provides
    @AppDIScope
    fun diskMainDIComponent(
        commonMainDIComponent: CommonMainDIComponent,
        modularDependencies: ModularDependencies
    ): DiskMainDIComponent =
        DiskMainDIComponentBuilder().buildComponent(commonMainDIComponent, modularDependencies)

    @Provides
    @AppDIScope
    fun communicatorMainDIComponent(
        commonMainDIComponent: CommonMainDIComponent,
        modularDependencies: ModularDependencies
    ): CommunicatorMainDIComponent =
        CommunicatorMainDIComponentBuilder().buildComponent(commonMainDIComponent, modularDependencies)
}