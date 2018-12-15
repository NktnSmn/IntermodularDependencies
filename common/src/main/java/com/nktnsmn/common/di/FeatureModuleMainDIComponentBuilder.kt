package com.nktnsmn.common.di

import com.nktnsmn.common.di.main.CommonMainDIComponent

interface FeatureModuleMainDIComponentBuilder<C, D> {

    fun buildComponent(commonMainDIComponent: CommonMainDIComponent, dependencies: D): C
}