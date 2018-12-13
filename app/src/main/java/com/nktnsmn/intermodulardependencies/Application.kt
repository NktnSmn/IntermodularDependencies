package com.nktnsmn.intermodulardependencies

import android.app.Application
import com.nktnsmn.communicator.contract.CommunicatorDependency
import com.nktnsmn.communicator.contract.CommunicatorDependencyProvider
import com.nktnsmn.disk.contract.DiskDependencies
import com.nktnsmn.disk.contract.DiskDependenciesProvider
import com.nktnsmn.disk.contract.DiskFeatureDefault
import com.nktnsmn.news.contract.NewsDependencies
import com.nktnsmn.news.contract.NewsDependenciesProvider
import com.nktnsmn.news.contract.NewsFeatureDefault

class Application :
    Application(),
    DiskDependenciesProvider,
    NewsDependenciesProvider,
    CommunicatorDependencyProvider {

    private val modularDependencies = ModularDependencies(DiskFeatureDefault(this), NewsFeatureDefault(this))

    override fun provideDiskDependencies(): DiskDependencies = modularDependencies

    override fun provideNewsDependencies(): NewsDependencies = modularDependencies

    override fun provideCommunicatorDependency(): CommunicatorDependency = modularDependencies
}