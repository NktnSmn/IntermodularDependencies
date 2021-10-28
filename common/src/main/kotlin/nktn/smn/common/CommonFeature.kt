package nktn.smn.common

import android.app.Application
import nktn.smn.feature.Feature

object CommonFeature : Feature<Unit>, CommonApi {

    override fun initialize(application: Application, deps: Unit, optDeps: Any?) = Unit

    override val resourceProvider: ResourceProvider = ResourceProviderImpl()
}