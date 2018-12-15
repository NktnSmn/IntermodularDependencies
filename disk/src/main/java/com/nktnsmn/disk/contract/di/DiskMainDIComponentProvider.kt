package com.nktnsmn.disk.contract.di

import com.nktnsmn.disk.mainDI.DiskMainDIComponent

interface DiskMainDIComponentProvider {

    fun diskMainDIComponent(): DiskMainDIComponent
}