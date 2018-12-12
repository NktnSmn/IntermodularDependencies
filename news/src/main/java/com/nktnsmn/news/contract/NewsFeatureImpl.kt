package com.nktnsmn.news.contract

import android.content.Context
import com.nktnsmn.news.NewsPublisherImpl
import com.nktnsmn.news.NewsViewerImpl

class NewsFeatureImpl(private val appContext: Context) : NewsFeature {

    override fun publishNews(title: String, content: String) {
        NewsPublisherImpl().publishNews(title, content)
    }

    override fun viewNews(uuid: String) {
        NewsViewerImpl(newsDependencies()).viewNews(uuid)
    }

    private fun newsDependencies(): NewsDependencies =
        (appContext as NewsDependenciesProvider).provideNewsDependencies()
}