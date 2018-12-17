package com.nktnsmn.communicator.contract.di

import com.nktnsmn.common.di.FeatureModuleDIComponentBuilder
import com.nktnsmn.common.di.main.CommonMainDIComponent
import com.nktnsmn.communicator.contract.dependencies.CommunicatorDependencies
import com.nktnsmn.communicator.mainDI.CommunicatorMainDIComponent
import com.nktnsmn.communicator.mainDI.DaggerCommunicatorMainDIComponent

class CommunicatorMainDIComponentBuilder(
    commonMainDIComponent: CommonMainDIComponent,
    dependencies: CommunicatorDependencies
) : FeatureModuleDIComponentBuilder<CommunicatorMainDIComponent, CommunicatorDependencies>(
    commonMainDIComponent,
    dependencies
) {

    override fun buildComponentImmediately(): CommunicatorMainDIComponent =
        DaggerCommunicatorMainDIComponent.builder()
            .commonMainDIComponent(commonMainDIComponent)
            .communicatorDependencies(dependencies)
            .build()
}