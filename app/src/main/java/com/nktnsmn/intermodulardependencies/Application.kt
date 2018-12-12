package com.nktnsmn.intermodulardependencies

import android.app.Application
import com.nktnsmn.communicator.contract.CommunicatorDependency
import com.nktnsmn.communicator.contract.CommunicatorDependencyProvider
import com.nktnsmn.disk.contract.DiskDependencies
import com.nktnsmn.disk.contract.DiskDependenciesProvider
import com.nktnsmn.disk.contract.DiskFeatureImpl
import com.nktnsmn.news.contract.NewsDependencies
import com.nktnsmn.news.contract.NewsDependenciesProvider
import com.nktnsmn.news.contract.NewsFeatureImpl

class Application :
    Application(),
    DiskDependenciesProvider,
    NewsDependenciesProvider,
    CommunicatorDependencyProvider {

    private val moduleDependenciesProvider = ModuleDependenciesProvider(DiskFeatureImpl(this), NewsFeatureImpl(this))

    override fun provideDiskDependencies(): DiskDependencies = moduleDependenciesProvider

    override fun provideNewsDependencies(): NewsDependencies = moduleDependenciesProvider

    override fun provideCommunicatorDependency(): CommunicatorDependency = moduleDependenciesProvider
}