package com.nktnsmn.messenger.contract.di

import com.nktnsmn.common.di.FeatureModuleDIComponentBuilder
import com.nktnsmn.common.di.main.CommonMainDIComponent
import com.nktnsmn.messenger.contract.dependencies.MessengerDependencies
import com.nktnsmn.messenger.mainDI.MessengerMainDIComponent
import com.nktnsmn.messenger.mainDI.DaggerMessengerMainDIComponent

class MessengerMainDIComponentBuilder(
    commonMainDIComponent: CommonMainDIComponent,
    dependencies: MessengerDependencies
) : FeatureModuleDIComponentBuilder<MessengerMainDIComponent, MessengerDependencies>(
    commonMainDIComponent,
    dependencies
) {

    override fun buildComponentImmediately(): MessengerMainDIComponent =
        DaggerMessengerMainDIComponent.builder()
            .commonMainDIComponent(commonMainDIComponent)
            .messengerDependencies(dependencies)
            .build()
}