package nktn.smn.intermodular_deps

import android.app.Application

class IntermodularDepsApplication : Application() {

    init {
        FeaturesMediator(this)
    }
}