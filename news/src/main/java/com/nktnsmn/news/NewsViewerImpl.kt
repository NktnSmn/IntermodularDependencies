package com.nktnsmn.news

import com.nktnsmn.declaration.disk.FileDownloader
import com.nktnsmn.declaration.news.NewsViewer

class NewsViewerImpl(private val fileDownloader: FileDownloader) : NewsViewer {

    override fun viewNews(uuid: String) {
    }
}