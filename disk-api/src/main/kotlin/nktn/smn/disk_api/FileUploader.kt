package nktn.smn.disk_api

interface FileUploader {

    fun uploadFile(absolutePath: String, targetDocumentUuid: String)
}