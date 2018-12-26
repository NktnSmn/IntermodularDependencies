package com.nktnsmn.messenger.contract.di

import com.nktnsmn.messenger.mainDI.MessengerMainDIComponent

interface MessengerMainDIComponentProvider {

    fun messengerMainDIComponent(): MessengerMainDIComponent
}