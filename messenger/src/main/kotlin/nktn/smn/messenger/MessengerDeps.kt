package nktn.smn.messenger

import nktn.smn.disk_api.FileDownloader
import nktn.smn.news_api.NewsViewer

interface MessengerDeps : NewsViewer, FileDownloader