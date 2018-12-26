package com.nktnsmn.common.di.main

import android.content.Context
import com.nktnsmn.common.contract.di.CommonMainDIComponentProvider
import dagger.Component

@CommonMainDIScope
@Component(modules = [CommonMainDIModule::class])
interface CommonMainDIComponent : CommonExposedDI {

    companion object {
        fun fromContext(context: Context): CommonMainDIComponent =
            (context.applicationContext as CommonMainDIComponentProvider).commonMainDIComponent()
    }
}