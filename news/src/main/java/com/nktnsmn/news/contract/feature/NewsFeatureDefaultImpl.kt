package com.nktnsmn.news.contract.feature

import com.nktnsmn.news.NewsPublisherImpl
import com.nktnsmn.news.NewsViewerImpl

class NewsFeatureDefaultImpl : NewsFeature {

    override fun publishNews(title: String, content: String) {
        NewsPublisherImpl().publishNews(title, content)
    }

    override fun viewNews(uuid: String) {
        NewsViewerImpl().viewNews(uuid)
    }
}