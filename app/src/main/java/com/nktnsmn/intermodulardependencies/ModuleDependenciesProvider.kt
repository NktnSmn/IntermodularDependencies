package com.nktnsmn.intermodulardependencies

import com.nktnsmn.disk.contract.DiskDependencies
import com.nktnsmn.disk.contract.DiskFeature
import com.nktnsmn.disk.contract.DiskFeatureImpl
import com.nktnsmn.news.contract.NewsDependencies
import com.nktnsmn.news.contract.NewsFeature
import com.nktnsmn.news.contract.NewsFeatureImpl

class ModuleDependenciesProvider(
    diskFeatureImpl: DiskFeatureImpl,
    newsFeatureImpl: NewsFeatureImpl
) : DiskFeature by diskFeatureImpl,
    NewsFeature by newsFeatureImpl,
    DiskDependencies,
    NewsDependencies