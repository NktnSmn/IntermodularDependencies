package com.nktnsmn.disk.contract

import com.nktnsmn.declaration.disk.DocumentViewer
import com.nktnsmn.declaration.disk.FileDownloader
import com.nktnsmn.declaration.disk.FileUploader

interface DiskFeature : FileDownloader, FileUploader, DocumentViewer