package nktn.smn.messenger

import android.app.Application
import android.content.Context
import android.content.Intent
import nktn.smn.common.IntentUtils
import nktn.smn.feature.Feature
import nktn.smn.messenger.di.DaggerMessengerMainDIComponent
import nktn.smn.messenger.di.MessengerMainDIComponent

object MessengerFeature : Feature<MessengerDeps>, MessengerApi {

    private lateinit var deps: MessengerDeps
    internal val diComponent: MessengerMainDIComponent by lazy {
        DaggerMessengerMainDIComponent.builder().messengerDeps(deps).build()
    }

    override fun initialize(application: Application, deps: MessengerDeps, optDeps: Any?) {
        this.deps = deps
    }

    override fun newMessengerMainScreenIntent(context: Context): Intent =
        IntentUtils.newIntent(context, MessengerMainActivity::class.java)
}