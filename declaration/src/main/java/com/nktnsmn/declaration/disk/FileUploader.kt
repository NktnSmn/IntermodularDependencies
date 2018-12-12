package com.nktnsmn.declaration.disk

interface FileUploader {

    fun uploadFile(absolutePath: String, targetDocumentUuid: String)
}