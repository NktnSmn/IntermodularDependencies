package com.nktnsmn.intermodulardependencies.di.app.companion

import com.nktnsmn.intermodulardependencies.di.app.AppDIComponent

interface AppDIComponentProvider {

    fun appDIComponent(): AppDIComponent
}