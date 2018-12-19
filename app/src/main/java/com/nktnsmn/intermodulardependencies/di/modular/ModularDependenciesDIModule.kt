package com.nktnsmn.intermodulardependencies.di.modular

import com.nktnsmn.intermodulardependencies.dependencies.modular.ModularDependencies
import com.nktnsmn.intermodulardependencies.dependencies.modular.ModularDependenciesManager
import com.nktnsmn.intermodulardependencies.di.app.AppDIScope
import dagger.Module
import dagger.Provides

@Module
class ModularDependenciesDIModule {

    @Provides
    @AppDIScope
    fun modularDependencies(): ModularDependencies =
        ModularDependenciesManager()
}