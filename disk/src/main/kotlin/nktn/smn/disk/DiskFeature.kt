package nktn.smn.disk

import android.app.Application
import nktn.smn.disk_api.FileDownloader
import nktn.smn.disk_api.FileViewer
import nktn.smn.feature.Feature

object DiskFeature :
    Feature<DiskDeps>,
    DiskApi,
    FileViewer by FileViewerImpl(),
    FileDownloader by FileDownloaderImpl() {

    private lateinit var deps: DiskDeps

    override fun initialize(application: Application, deps: DiskDeps, optDeps: Any?) {
        this.deps = deps
    }

    override fun uploadFile(absolutePath: String, targetDocumentUuid: String) {
        FileUploaderImpl().uploadFile(absolutePath, targetDocumentUuid)
    }
}