package com.nktnsmn.common.di.main

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

@Module
internal class CommonMainDIModule(private val application: Application) {

    @Provides
    @CommonMainDIScope
    fun applicationContext(): Context = application.applicationContext
}