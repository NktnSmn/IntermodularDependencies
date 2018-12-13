package com.nktnsmn.disk.contract

import android.content.Context
import com.nktnsmn.disk.DocumentViewerImpl
import com.nktnsmn.disk.FileDownloaderImpl
import com.nktnsmn.disk.FileUploaderImpl

class DiskFeatureDefault(private val appContext: Context) : DiskFeature {

    override fun downloadFile(uuid: String) {
        FileDownloaderImpl().downloadFile(uuid)
    }

    override fun uploadFile(absolutePath: String, targetDocumentUuid: String) {
        FileUploaderImpl().uploadFile(absolutePath, targetDocumentUuid)
    }

    override fun viewDocument(uuid: String) {
        DocumentViewerImpl(diskDependencies()).viewDocument(uuid)
    }

    private fun diskDependencies(): DiskDependencies =
        (appContext as DiskDependenciesProvider).provideDiskDependencies()
}