package com.nktnsmn.intermodulardependencies.di

import android.app.Application
import com.nktnsmn.common.di.main.CommonMainDIComponent
import com.nktnsmn.common.di.main.CommonMainDIModule
import com.nktnsmn.common.di.main.DaggerCommonMainDIComponent
import com.nktnsmn.communicator.contract.di.CommunicatorMainDIComponentBuilder
import com.nktnsmn.communicator.mainDI.CommunicatorMainDIComponent
import com.nktnsmn.disk.contract.di.DiskMainDIComponentBuilder
import com.nktnsmn.disk.mainDI.DiskMainDIComponent
import com.nktnsmn.intermodulardependencies.modulardependencies.ModularDependencies
import com.nktnsmn.intermodulardependencies.modulardependencies.ModularDependenciesManager

class ModularDIComponentsBuilder(private val application: Application) {

    private val modularDependencies: ModularDependencies = ModularDependenciesManager()

    fun buildCommonMainDIComponent(): CommonMainDIComponent =
        DaggerCommonMainDIComponent.builder()
            .commonMainDIModule(CommonMainDIModule(application))
            .build()

    fun buildDiskMainDIComponent(
        commonMainDIComponent: CommonMainDIComponent
    ): DiskMainDIComponent =
        DiskMainDIComponentBuilder().buildComponent(commonMainDIComponent, modularDependencies)

    fun buildCommunicatorMainDIComponent(
        commonMainDIComponent: CommonMainDIComponent
    ): CommunicatorMainDIComponent =
        CommunicatorMainDIComponentBuilder().buildComponent(commonMainDIComponent, modularDependencies)
}