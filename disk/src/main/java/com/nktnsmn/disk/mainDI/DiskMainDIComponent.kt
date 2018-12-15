package com.nktnsmn.disk.mainDI

import android.content.Context
import com.nktnsmn.common.di.main.CommonExposedDI
import com.nktnsmn.common.di.main.CommonMainDIComponent
import com.nktnsmn.disk.contract.dependencies.DiskDependencies
import com.nktnsmn.disk.contract.di.DiskMainDIComponentProvider
import dagger.BindsInstance
import dagger.Component

@DiskMainDIScope
@Component(dependencies = [CommonMainDIComponent::class], modules = [DiskMainDIModule::class])
interface DiskMainDIComponent : CommonExposedDI {

    fun diskDependencies(): DiskDependencies

    @Component.Builder
    interface Builder {

        fun commonMainDIComponent(commonMainDIComponent: CommonMainDIComponent): Builder

        @BindsInstance
        fun diskDependencies(diskDependencies: DiskDependencies): Builder

        fun build(): DiskMainDIComponent
    }

    companion object {
        internal fun fromContext(context: Context): DiskMainDIComponent =
            (context.applicationContext as DiskMainDIComponentProvider).diskMainDIComponent()
    }
}