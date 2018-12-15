package com.nktnsmn.communicator.contract.di

import com.nktnsmn.common.di.FeatureModuleMainDIComponentBuilder
import com.nktnsmn.common.di.main.CommonMainDIComponent
import com.nktnsmn.communicator.contract.dependencies.CommunicatorDependencies
import com.nktnsmn.communicator.mainDI.CommunicatorMainDIComponent
import com.nktnsmn.communicator.mainDI.DaggerCommunicatorMainDIComponent

class CommunicatorMainDIComponentBuilder :
    FeatureModuleMainDIComponentBuilder<CommunicatorMainDIComponent, CommunicatorDependencies> {

    override fun buildComponent(
        commonMainDIComponent: CommonMainDIComponent,
        dependencies: CommunicatorDependencies
    ): CommunicatorMainDIComponent =
        DaggerCommunicatorMainDIComponent.builder()
            .commonMainDIComponent(commonMainDIComponent)
            .communicatorDependencies(dependencies)
            .build()
}