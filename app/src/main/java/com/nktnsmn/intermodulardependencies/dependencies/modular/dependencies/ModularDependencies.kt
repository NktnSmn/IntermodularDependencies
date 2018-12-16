package com.nktnsmn.intermodulardependencies.dependencies.modular.dependencies

import com.nktnsmn.communicator.contract.dependencies.CommunicatorDependencies
import com.nktnsmn.disk.contract.dependencies.DiskDependencies
import com.nktnsmn.intermodulardependencies.dependencies.AppDependencies
import com.nktnsmn.news.contract.dependencies.NewsDependencies

interface ModularDependencies :
    AppDependencies,
    DiskDependencies,
    NewsDependencies,
    CommunicatorDependencies