package com.nktnsmn.disk.contract.di

import com.nktnsmn.common.di.FeatureModuleDIComponentBuilder
import com.nktnsmn.common.di.main.CommonMainDIComponent
import com.nktnsmn.disk.contract.dependencies.DiskDependencies
import com.nktnsmn.disk.mainDI.DaggerDiskMainDIComponent
import com.nktnsmn.disk.mainDI.DiskMainDIComponent

class DiskMainDIComponentBuilder(
    commonMainDIComponent: CommonMainDIComponent,
    dependencies: DiskDependencies
) : FeatureModuleDIComponentBuilder<DiskMainDIComponent, DiskDependencies>(commonMainDIComponent, dependencies) {

    override fun buildComponentImmediately(): DiskMainDIComponent =
        DaggerDiskMainDIComponent.builder()
            .commonMainDIComponent(commonMainDIComponent)
            .diskDependencies(dependencies)
            .build()
}