package com.nktnsmn.common.contract.di

import android.app.Application
import com.nktnsmn.common.di.main.CommonMainDIComponent
import com.nktnsmn.common.di.main.CommonMainDIModule
import com.nktnsmn.common.di.main.DaggerCommonMainDIComponent

class CommonMainDIComponentBuilder {

    fun buildComponent(application: Application): CommonMainDIComponent =
        DaggerCommonMainDIComponent.builder()
            .commonMainDIModule(CommonMainDIModule(application))
            .build()
}