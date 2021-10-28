package nktn.smn.messenger.di

import dagger.Component
import nktn.smn.messenger.MessengerDeps

@MessengerMainDIScope
@Component(dependencies = [MessengerDeps::class], modules = [MessengerMainDIModule::class])
internal interface MessengerMainDIComponent {

    fun messengerDependencies(): MessengerDeps
}