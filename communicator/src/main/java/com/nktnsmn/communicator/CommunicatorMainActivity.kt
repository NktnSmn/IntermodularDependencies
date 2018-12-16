package com.nktnsmn.communicator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.nktnsmn.communicator.mainDI.CommunicatorMainDIComponent

internal class CommunicatorMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_communicator)
        val communicatorDependencies = CommunicatorMainDIComponent.fromContext(this).communicatorDependencies()
        MessageReaderImpl(communicatorDependencies, communicatorDependencies).readMessage("uuid")
    }
}
