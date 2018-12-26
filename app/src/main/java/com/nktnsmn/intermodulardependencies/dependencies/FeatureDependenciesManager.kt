package com.nktnsmn.intermodulardependencies.dependencies

import com.nktnsmn.messenger.contract.feature.MessengerFeatureDefaultImpl
import com.nktnsmn.featuresAPI.disk.DiskFeature
import com.nktnsmn.disk.contract.feature.DiskFeatureDefaultImpl
import com.nktnsmn.featuresAPI.messenger.MessengerFeature
import com.nktnsmn.intermodulardependencies.dependencies.declaration.FeatureDependencies
import com.nktnsmn.featuresAPI.news.NewsFeature
import com.nktnsmn.news.contract.feature.NewsFeatureDefaultImpl

class FeatureDependenciesManager(
    private val diskFeature: DiskFeature = DiskFeatureDefaultImpl(),
    private val newsFeature: NewsFeature = NewsFeatureDefaultImpl(),
    private val messengerFeature: MessengerFeature = MessengerFeatureDefaultImpl()
) :
    DiskFeature by diskFeature,
    NewsFeature by newsFeature,
    MessengerFeature by messengerFeature,
    FeatureDependencies