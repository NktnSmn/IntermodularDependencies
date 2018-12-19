package com.nktnsmn.intermodulardependencies.di.dependencies

import com.nktnsmn.intermodulardependencies.dependencies.declaration.AppDependencies
import com.nktnsmn.intermodulardependencies.dependencies.declaration.FeatureDependencies
import com.nktnsmn.intermodulardependencies.dependencies.FeatureDependenciesManager
import com.nktnsmn.intermodulardependencies.dependencies.declaration.ModularDependencies
import com.nktnsmn.intermodulardependencies.di.app.AppDIScope
import dagger.Module
import dagger.Provides

@Module
class FeatureDependenciesDIModule {

    @Provides
    @AppDIScope
    fun featureDependencies(): FeatureDependencies = FeatureDependenciesManager()

    @Provides
    @AppDIScope
    fun modularDependencies(featureDependencies: FeatureDependencies): ModularDependencies = featureDependencies

    @Provides
    @AppDIScope
    fun appDependencies(featureDependencies: FeatureDependencies): AppDependencies = featureDependencies
}