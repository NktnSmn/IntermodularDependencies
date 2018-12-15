package com.nktnsmn.intermodulardependencies.modularfeatures

import com.nktnsmn.disk.contract.feature.DiskFeature
import com.nktnsmn.disk.contract.feature.DiskFeatureDefaultImpl
import com.nktnsmn.news.contract.feature.NewsFeature
import com.nktnsmn.news.contract.feature.NewsFeatureDefaultImpl

open class ModularFeatures :
    DiskFeature by DiskFeatureDefaultImpl(),
    NewsFeature by NewsFeatureDefaultImpl()