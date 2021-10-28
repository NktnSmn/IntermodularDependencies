package nktn.smn.intermodular_deps

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import nktn.smn.messenger_api.MessengerMainScreenIntentProvider

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app_activity_main)
        val messengerMainScreenIntentProvider: MessengerMainScreenIntentProvider = AppFeature.deps
        startActivity(messengerMainScreenIntentProvider.newMessengerMainScreenIntent(this))
    }
}
