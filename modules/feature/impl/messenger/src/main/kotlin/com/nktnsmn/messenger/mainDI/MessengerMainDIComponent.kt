package com.nktnsmn.messenger.mainDI

import android.content.Context
import com.nktnsmn.common.di.main.CommonExposedDI
import com.nktnsmn.common.di.main.CommonMainDIComponent
import com.nktnsmn.messenger.contract.dependencies.MessengerDependencies
import com.nktnsmn.messenger.contract.di.MessengerMainDIComponentProvider
import dagger.BindsInstance
import dagger.Component

@MessengerMainDIScope
@Component(dependencies = [CommonMainDIComponent::class], modules = [MessengerMainDIModule::class])
interface MessengerMainDIComponent : CommonExposedDI {

    fun messengerDependencies(): MessengerDependencies

    @Component.Builder
    interface Builder {

        fun commonMainDIComponent(commonMainDIComponent: CommonMainDIComponent): Builder

        @BindsInstance
        fun messengerDependencies(messengerDependencies: MessengerDependencies): Builder

        fun build(): MessengerMainDIComponent
    }

    companion object {
        internal fun fromContext(context: Context): MessengerMainDIComponent =
            (context.applicationContext as MessengerMainDIComponentProvider).messengerMainDIComponent()
    }
}