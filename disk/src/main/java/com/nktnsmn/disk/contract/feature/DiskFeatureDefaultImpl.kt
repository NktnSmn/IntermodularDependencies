package com.nktnsmn.disk.contract.feature

import com.nktnsmn.disk.DocumentViewerImpl
import com.nktnsmn.disk.FileDownloaderImpl
import com.nktnsmn.disk.FileUploaderImpl

class DiskFeatureDefaultImpl : DiskFeature {

    override fun downloadFile(uuid: String) {
        FileDownloaderImpl().downloadFile(uuid)
    }

    override fun uploadFile(absolutePath: String, targetDocumentUuid: String) {
        FileUploaderImpl().uploadFile(absolutePath, targetDocumentUuid)
    }

    override fun viewDocument(uuid: String) {
        DocumentViewerImpl().viewDocument(uuid)
    }
}