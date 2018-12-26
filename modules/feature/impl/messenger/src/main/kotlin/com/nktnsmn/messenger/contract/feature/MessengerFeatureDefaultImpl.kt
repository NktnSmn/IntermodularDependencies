package com.nktnsmn.messenger.contract.feature

import android.content.Context
import android.content.Intent
import com.nktnsmn.common.utils.IntentUtils
import com.nktnsmn.featuresAPI.messenger.MessengerFeature
import com.nktnsmn.messenger.MessengerMainActivity

class MessengerFeatureDefaultImpl : MessengerFeature {

    override fun newMessengerMainScreenIntent(context: Context): Intent =
        IntentUtils.newIntent(context, MessengerMainActivity::class.java)
}