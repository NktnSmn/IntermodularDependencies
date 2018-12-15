package com.nktnsmn.communicator.contract.dependencies

import com.nktnsmn.declaration.disk.FileDownloader
import com.nktnsmn.declaration.news.NewsViewer

interface CommunicatorDependencies : NewsViewer, FileDownloader