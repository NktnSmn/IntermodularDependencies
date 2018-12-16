package com.nktnsmn.intermodulardependencies.di.modular

import com.nktnsmn.common.contract.di.CommonMainDIComponentProvider
import com.nktnsmn.communicator.contract.di.CommunicatorMainDIComponentProvider
import com.nktnsmn.disk.contract.di.DiskMainDIComponentProvider

interface ModularDIComponentsProvider :
    CommonMainDIComponentProvider,
    DiskMainDIComponentProvider,
    CommunicatorMainDIComponentProvider