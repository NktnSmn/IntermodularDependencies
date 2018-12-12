package com.nktnsmn.communicator.contract

import com.nktnsmn.declaration.disk.FileDownloader
import com.nktnsmn.declaration.news.NewsViewer

interface CommunicatorDependency : NewsViewer, FileDownloader