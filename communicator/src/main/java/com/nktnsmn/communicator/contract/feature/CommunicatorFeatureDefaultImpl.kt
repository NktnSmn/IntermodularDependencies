package com.nktnsmn.communicator.contract.feature

import android.content.Context
import android.content.Intent
import com.nktnsmn.common.utils.IntentUtils
import com.nktnsmn.communicator.CommunicatorMainActivity

class CommunicatorFeatureDefaultImpl : CommunicatorFeature {

    override fun newCommunicatorActivityIntent(context: Context): Intent =
        IntentUtils.newIntent(context, CommunicatorMainActivity::class.java)
}