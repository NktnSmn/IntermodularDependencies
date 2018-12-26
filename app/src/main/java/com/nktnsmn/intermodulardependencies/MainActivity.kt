package com.nktnsmn.intermodulardependencies

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.nktnsmn.featuresAPI.messenger.MessengerMainScreenIntentProvider
import com.nktnsmn.intermodulardependencies.di.app.AppDIComponent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app_activity_main)
        val messengerMainScreenIntentProvider: MessengerMainScreenIntentProvider =
            AppDIComponent.fromContext(this).appDependencies()
        startActivity(messengerMainScreenIntentProvider.newMessengerMainScreenIntent(this))
    }
}
