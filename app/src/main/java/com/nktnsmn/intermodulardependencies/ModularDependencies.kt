package com.nktnsmn.intermodulardependencies

import com.nktnsmn.communicator.contract.CommunicatorDependency
import com.nktnsmn.disk.contract.DiskDependencies
import com.nktnsmn.disk.contract.DiskFeature
import com.nktnsmn.disk.contract.DiskFeatureDefault
import com.nktnsmn.news.contract.NewsDependencies
import com.nktnsmn.news.contract.NewsFeature
import com.nktnsmn.news.contract.NewsFeatureDefault

class ModularDependencies(
    diskFeatureDefault: DiskFeatureDefault,
    newsFeatureDefault: NewsFeatureDefault
) : DiskFeature by diskFeatureDefault,
    NewsFeature by newsFeatureDefault,
    DiskDependencies,
    NewsDependencies,
    CommunicatorDependency