package com.nktnsmn.communicator.contract.di

import com.nktnsmn.communicator.mainDI.CommunicatorMainDIComponent

interface CommunicatorMainDIComponentProvider {

    fun communicatorMainDIComponent(): CommunicatorMainDIComponent
}