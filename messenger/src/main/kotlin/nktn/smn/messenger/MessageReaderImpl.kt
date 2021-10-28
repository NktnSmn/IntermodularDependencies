package nktn.smn.messenger

import nktn.smn.disk_api.FileDownloader
import nktn.smn.news_api.NewsViewer

internal class MessageReaderImpl(private val newsViewer: NewsViewer, private val fileDownloader: FileDownloader) {

    fun readMessage(uuid: String) = Unit
}