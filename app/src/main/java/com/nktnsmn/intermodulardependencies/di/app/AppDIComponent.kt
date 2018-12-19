package com.nktnsmn.intermodulardependencies.di.app

import android.content.Context
import com.nktnsmn.intermodulardependencies.dependencies.declaration.AppDependencies
import com.nktnsmn.intermodulardependencies.di.app.companion.AppDIComponentProvider
import com.nktnsmn.intermodulardependencies.di.modular.ModularDIComponentsDIModule
import com.nktnsmn.intermodulardependencies.di.modular.ModularDIComponentsProvider
import com.nktnsmn.intermodulardependencies.di.dependencies.FeatureDependenciesDIModule
import dagger.Component

@AppDIScope
@Component(modules = [FeatureDependenciesDIModule::class, ModularDIComponentsDIModule::class, AppDIModule::class])
interface AppDIComponent : ModularDIComponentsProvider {

    fun appDependencies(): AppDependencies

    companion object {
        fun fromContext(context: Context): AppDIComponent =
            (context.applicationContext as AppDIComponentProvider).appDIComponent()
    }
}