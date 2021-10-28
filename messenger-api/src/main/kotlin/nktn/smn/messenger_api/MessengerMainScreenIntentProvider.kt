package nktn.smn.messenger_api

import android.content.Context
import android.content.Intent

interface MessengerMainScreenIntentProvider {

    fun newMessengerMainScreenIntent(context: Context): Intent
}