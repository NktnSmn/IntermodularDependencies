package com.nktnsmn.common.di

import com.nktnsmn.common.di.main.CommonMainDIComponent

abstract class FeatureModuleDIComponentBuilder<C, D>(
    protected val commonMainDIComponent: CommonMainDIComponent,
    protected val dependencies: D
) : DIComponentBuilder<C>()