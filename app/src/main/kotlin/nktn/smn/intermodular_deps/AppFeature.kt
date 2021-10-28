package nktn.smn.intermodular_deps

import android.app.Application
import nktn.smn.feature.Feature

/**
 * TODO WIP
 *
 * @author sa.nikitin
 */
object AppFeature : Feature<AppDeps> {

    internal lateinit var deps: AppDeps

    override fun initialize(application: Application, deps: AppDeps, optDeps: Any?) {
        this.deps = deps
    }
}