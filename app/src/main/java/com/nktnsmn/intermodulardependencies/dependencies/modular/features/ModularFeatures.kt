package com.nktnsmn.intermodulardependencies.dependencies.modular.features

import com.nktnsmn.communicator.contract.feature.CommunicatorFeature
import com.nktnsmn.communicator.contract.feature.CommunicatorFeatureDefaultImpl
import com.nktnsmn.disk.contract.feature.DiskFeature
import com.nktnsmn.disk.contract.feature.DiskFeatureDefaultImpl
import com.nktnsmn.news.contract.feature.NewsFeature
import com.nktnsmn.news.contract.feature.NewsFeatureDefaultImpl

open class ModularFeatures :
    DiskFeature by DiskFeatureDefaultImpl(),
    NewsFeature by NewsFeatureDefaultImpl(),
    CommunicatorFeature by CommunicatorFeatureDefaultImpl()