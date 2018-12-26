package com.nktnsmn.featuresAPI.disk

interface FileUploader {

    fun uploadFile(absolutePath: String, targetDocumentUuid: String)
}