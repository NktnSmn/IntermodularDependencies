package nktn.smn.disk

import nktn.smn.common.ResourceProvider
import nktn.smn.messenger_api.MessengerMainScreenIntentProvider

interface DiskDeps : MessengerMainScreenIntentProvider {

    val resourceProvider: ResourceProvider
}