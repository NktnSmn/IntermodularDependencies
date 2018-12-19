package com.nktnsmn.intermodulardependencies.dependencies.modular

import com.nktnsmn.communicator.contract.feature.CommunicatorFeature
import com.nktnsmn.communicator.contract.feature.CommunicatorFeatureDefaultImpl
import com.nktnsmn.disk.contract.feature.DiskFeature
import com.nktnsmn.disk.contract.feature.DiskFeatureDefaultImpl
import com.nktnsmn.news.contract.feature.NewsFeature
import com.nktnsmn.news.contract.feature.NewsFeatureDefaultImpl

class ModularDependenciesManager(
    private val diskFeature: DiskFeature = DiskFeatureDefaultImpl(),
    private val newsFeature: NewsFeature = NewsFeatureDefaultImpl(),
    private val communicatorFeature: CommunicatorFeature = CommunicatorFeatureDefaultImpl()
) :
    DiskFeature by diskFeature,
    NewsFeature by newsFeature,
    CommunicatorFeature by communicatorFeature,
    ModularDependencies