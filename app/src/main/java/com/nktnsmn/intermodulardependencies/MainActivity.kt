package com.nktnsmn.intermodulardependencies

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.nktnsmn.declaration.communicator.CommunicatorActivityIntentProvider
import com.nktnsmn.intermodulardependencies.di.app.AppDIComponent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val communicatorActivityIntentProvider: CommunicatorActivityIntentProvider =
            AppDIComponent.fromContext(this).appDependencies()
        startActivity(communicatorActivityIntentProvider.newCommunicatorActivityIntent(this))
    }
}
