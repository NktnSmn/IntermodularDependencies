package com.nktnsmn.declaration.communicator

import android.content.Context
import android.content.Intent

interface CommunicatorActivityIntentProvider {

    fun newCommunicatorActivityIntent(context: Context): Intent
}