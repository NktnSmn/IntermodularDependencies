package com.nktnsmn.intermodulardependencies.di.app.companion

import android.app.Application
import com.nktnsmn.common.di.DIComponentBuilder
import com.nktnsmn.intermodulardependencies.di.app.AppDIComponent
import com.nktnsmn.intermodulardependencies.di.app.DaggerAppDIComponent
import com.nktnsmn.intermodulardependencies.di.modular.ModularDIComponentsDIModule

class AppDIComponentBuilder(private val application: Application) : DIComponentBuilder<AppDIComponent>() {

    override fun buildComponentImmediately(): AppDIComponent =
        DaggerAppDIComponent.builder()
            .modularDIComponentsDIModule(ModularDIComponentsDIModule(application))
            .build()
}