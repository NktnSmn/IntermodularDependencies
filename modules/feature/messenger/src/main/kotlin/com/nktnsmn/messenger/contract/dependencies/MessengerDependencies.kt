package com.nktnsmn.messenger.contract.dependencies

import com.nktnsmn.featuresAPI.disk.FileDownloader
import com.nktnsmn.featuresAPI.news.NewsViewer

interface MessengerDependencies : NewsViewer, FileDownloader