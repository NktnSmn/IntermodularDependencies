package com.nktnsmn.disk.contract.di

import com.nktnsmn.common.di.FeatureModuleMainDIComponentBuilder
import com.nktnsmn.common.di.main.CommonMainDIComponent
import com.nktnsmn.disk.contract.dependencies.DiskDependencies
import com.nktnsmn.disk.mainDI.DaggerDiskMainDIComponent
import com.nktnsmn.disk.mainDI.DiskMainDIComponent

class DiskMainDIComponentBuilder : FeatureModuleMainDIComponentBuilder<DiskMainDIComponent, DiskDependencies> {

    override fun buildComponent(
        commonMainDIComponent: CommonMainDIComponent,
        dependencies: DiskDependencies
    ): DiskMainDIComponent =
        DaggerDiskMainDIComponent.builder()
            .commonMainDIComponent(commonMainDIComponent)
            .diskDependencies(dependencies)
            .build()
}