package com.nktnsmn.communicator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.nktnsmn.communicator.contract.CommunicatorDependencyProvider

class CommunicatorMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_communicator)

        val communicatorDependencyProvider = this.applicationContext as CommunicatorDependencyProvider
        val communicatorDependency = communicatorDependencyProvider.provideCommunicatorDependency()
        MessageReaderImpl(communicatorDependency, communicatorDependency).readMessage("uuid")
    }
}
