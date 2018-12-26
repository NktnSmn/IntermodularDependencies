package com.nktnsmn.intermodulardependencies.di.modular

import com.nktnsmn.common.contract.di.CommonMainDIComponentProvider
import com.nktnsmn.messenger.contract.di.MessengerMainDIComponentProvider
import com.nktnsmn.disk.contract.di.DiskMainDIComponentProvider

interface ModularDIComponentsProvider :
    CommonMainDIComponentProvider,
    DiskMainDIComponentProvider,
    MessengerMainDIComponentProvider