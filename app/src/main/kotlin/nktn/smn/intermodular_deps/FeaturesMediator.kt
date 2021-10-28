package nktn.smn.intermodular_deps

import android.app.Application
import nktn.smn.common.CommonApi
import nktn.smn.common.CommonFeature
import nktn.smn.disk.DiskApi
import nktn.smn.disk.DiskDeps
import nktn.smn.disk.DiskFeature
import nktn.smn.messenger.MessengerApi
import nktn.smn.messenger.MessengerDeps
import nktn.smn.messenger.MessengerFeature
import nktn.smn.news.NewsApi
import nktn.smn.news.NewsFeature

/*
* Вроде круто, всё в одном месте, инициализация достаточна прозрачна,
* но объявление фичи занимает 3 блока: Deps, Api by и initialize, упростить вроде никак
*/
class FeaturesMediator(application: Application) :
    AppDeps,
    CommonApi by CommonFeature,
    DiskDeps, DiskApi by DiskFeature,
    NewsApi by NewsFeature,
    MessengerDeps, MessengerApi by MessengerFeature {

    init {
        AppFeature.initialize(application = application, deps = this, optDeps = this)
        CommonFeature.initialize(application = application, deps = Unit, optDeps = this)
        DiskFeature.initialize(application = application, deps = this, optDeps = this)
        NewsFeature.initialize(application = application, deps = Unit, optDeps = this)
        MessengerFeature.initialize(application = application, deps = this, optDeps = this)
    }
}