package nktn.smn.news_api

interface NewsPublisher {

    fun publishNews(title: String, content: String)
}