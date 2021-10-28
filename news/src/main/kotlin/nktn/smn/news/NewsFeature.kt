package nktn.smn.news

import android.app.Application
import nktn.smn.disk_api.FileDownloader
import nktn.smn.feature.Feature

object NewsFeature : Feature<Unit>, NewsApi {

    internal var fileDownloader: FileDownloader? = null

    override fun initialize(application: Application, deps: Unit, optDeps: Any?) {
        if (optDeps is FileDownloader) {
            fileDownloader = optDeps
        }
    }

    override fun publishNews(title: String, content: String) {
        NewsPublisherImpl().publishNews(title, content)
    }

    override fun viewNews(uuid: String) {
        NewsViewerImpl().viewNews(uuid)
    }
}