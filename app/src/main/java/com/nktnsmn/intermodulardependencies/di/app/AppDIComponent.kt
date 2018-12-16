package com.nktnsmn.intermodulardependencies.di.app

import android.content.Context
import com.nktnsmn.intermodulardependencies.dependencies.AppDependencies
import com.nktnsmn.intermodulardependencies.di.modular.ModularDIComponentsDIModule
import com.nktnsmn.intermodulardependencies.di.modular.ModularDIComponentsProvider
import com.nktnsmn.intermodulardependencies.di.modular.ModularDependenciesDIModule
import dagger.Component

@AppDIScope
@Component(modules = [ModularDependenciesDIModule::class, ModularDIComponentsDIModule::class, AppDIModule::class])
interface AppDIComponent : ModularDIComponentsProvider {

    fun appDependencies(): AppDependencies

    companion object {
        fun fromContext(context: Context): AppDIComponent =
            (context.applicationContext as AppDIComponentProvider).appDIComponent()
    }
}