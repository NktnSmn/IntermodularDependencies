package com.nktnsmn.intermodulardependencies.di.app

import com.nktnsmn.intermodulardependencies.dependencies.AppDependencies
import com.nktnsmn.intermodulardependencies.dependencies.modular.ModularDependencies
import dagger.Module
import dagger.Provides

@Module
class AppDIModule {

    @Provides
    @AppDIScope
    fun appDependencies(modularDependencies: ModularDependencies): AppDependencies = modularDependencies
}