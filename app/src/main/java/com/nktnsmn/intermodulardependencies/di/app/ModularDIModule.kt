package com.nktnsmn.intermodulardependencies.di.app

import android.app.Application
import com.nktnsmn.common.contract.di.CommonMainDIComponentBuilder
import com.nktnsmn.common.di.main.CommonMainDIComponent
import com.nktnsmn.communicator.contract.di.CommunicatorMainDIComponentBuilder
import com.nktnsmn.communicator.mainDI.CommunicatorMainDIComponent
import com.nktnsmn.disk.contract.di.DiskMainDIComponentBuilder
import com.nktnsmn.disk.mainDI.DiskMainDIComponent
import com.nktnsmn.intermodulardependencies.modulardependencies.ModularDependencies
import com.nktnsmn.intermodulardependencies.modulardependencies.ModularDependenciesManager
import dagger.Module
import dagger.Provides

@Module
class ModularDIModule(private val application: Application) {

    private val modularDependencies: ModularDependencies = ModularDependenciesManager()

    @Provides
    @AppDIScope
    fun commonMainDIComponent(): CommonMainDIComponent = CommonMainDIComponentBuilder().buildComponent(application)

    @Provides
    @AppDIScope
    fun diskMainDIComponent(commonMainDIComponent: CommonMainDIComponent): DiskMainDIComponent =
        DiskMainDIComponentBuilder().buildComponent(commonMainDIComponent, modularDependencies)

    @Provides
    @AppDIScope
    fun communicatorMainDIComponent(commonMainDIComponent: CommonMainDIComponent): CommunicatorMainDIComponent =
        CommunicatorMainDIComponentBuilder().buildComponent(commonMainDIComponent, modularDependencies)
}