package com.nktnsmn.featuresAPI.messenger

import android.content.Context
import android.content.Intent

interface MessengerMainScreenIntentProvider {

    fun newMessengerMainScreenIntent(context: Context): Intent
}