package nktn.smn.disk

import nktn.smn.disk_api.FileViewer
import nktn.smn.disk_api.FileDownloader
import nktn.smn.disk_api.FileUploader

interface DiskApi : FileDownloader, FileUploader, FileViewer