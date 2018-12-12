package com.nktnsmn.intermodulardependencies

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.nktnsmn.communicator.CommunicatorMainActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startActivity(Intent(this, CommunicatorMainActivity::class.java))
    }
}
