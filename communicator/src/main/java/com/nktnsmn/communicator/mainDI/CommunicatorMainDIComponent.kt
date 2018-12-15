package com.nktnsmn.communicator.mainDI

import android.content.Context
import com.nktnsmn.common.di.main.CommonExposedDI
import com.nktnsmn.common.di.main.CommonMainDIComponent
import com.nktnsmn.communicator.contract.dependencies.CommunicatorDependencies
import com.nktnsmn.communicator.contract.di.CommunicatorMainDIComponentProvider
import dagger.BindsInstance
import dagger.Component

@CommunicatorMainDIScope
@Component(dependencies = [CommonMainDIComponent::class], modules = [CommunicatorMainDIModule::class])
interface CommunicatorMainDIComponent : CommonExposedDI {

    fun communicatorDependencies(): CommunicatorDependencies

    @Component.Builder
    interface Builder {

        fun commonMainDIComponent(commonMainDIComponent: CommonMainDIComponent): Builder

        @BindsInstance
        fun communicatorDependencies(communicatorDependencies: CommunicatorDependencies): Builder

        fun build(): CommunicatorMainDIComponent
    }

    companion object {
        internal fun fromContext(context: Context): CommunicatorMainDIComponent =
            (context.applicationContext as CommunicatorMainDIComponentProvider).communicatorMainDIComponent()
    }
}