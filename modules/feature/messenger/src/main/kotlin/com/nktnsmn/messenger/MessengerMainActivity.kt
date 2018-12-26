package com.nktnsmn.messenger

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.nktnsmn.messenger.mainDI.MessengerMainDIComponent

internal class MessengerMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.messenger_main_activity)
        val messengerDependencies = MessengerMainDIComponent.fromContext(this).messengerDependencies()
        MessageReaderImpl(messengerDependencies, messengerDependencies).readMessage("uuid")
    }
}
