package nktn.smn.messenger

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import nktn.smn.messenger.di.MessengerMainDIComponent

internal class MessengerMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.messenger_main_activity)
        val messengerDependencies = MessengerFeature.diComponent.messengerDependencies()
        MessageReaderImpl(messengerDependencies, messengerDependencies).readMessage("uuid")
    }
}
