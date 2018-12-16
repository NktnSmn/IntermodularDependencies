package com.nktnsmn.intermodulardependencies.di.app

import com.nktnsmn.intermodulardependencies.di.modular.ModularDIComponentsProvider
import dagger.Component

@AppDIScope
@Component(modules = [ModularDIModule::class])
interface AppDIComponent : ModularDIComponentsProvider