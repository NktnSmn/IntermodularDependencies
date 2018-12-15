package com.nktnsmn.common.contract.di

import com.nktnsmn.common.di.main.CommonMainDIComponent

interface CommonMainDIComponentProvider {

    fun commonMainDIComponent(): CommonMainDIComponent
}