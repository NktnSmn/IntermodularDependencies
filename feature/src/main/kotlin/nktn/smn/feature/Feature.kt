package nktn.smn.feature

import android.app.Application

/**
 * TODO WIP
 *
 * @author sa.nikitin
 */
interface Feature<Deps> {

    fun initialize(application: Application, deps: Deps, optDeps: Any?)
}