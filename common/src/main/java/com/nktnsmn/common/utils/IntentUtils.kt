package com.nktnsmn.common.utils

import android.content.Context
import android.content.Intent

object IntentUtils {

    fun newIntent(context: Context, targetClass: Class<*>): Intent =
        Intent(context, targetClass).also { intent ->
            if (context === context.applicationContext) {
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }
        }
}