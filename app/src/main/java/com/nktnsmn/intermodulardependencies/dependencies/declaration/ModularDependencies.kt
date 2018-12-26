package com.nktnsmn.intermodulardependencies.dependencies.declaration

import com.nktnsmn.messenger.contract.dependencies.MessengerDependencies
import com.nktnsmn.disk.contract.dependencies.DiskDependencies

interface ModularDependencies :
    DiskDependencies,
    MessengerDependencies