package com.bitmark.standardmobile.data.source.remote.api.error


/**
 * @author Hieu Pham
 * @since 2019-10-14
 * Email: hieupham@bitmark.com
 * Copyright © 2019 Bitmark. All rights reserved.
 */
class NetworkException(cause: Throwable) : Exception(cause) {
    override val message: String?
        get() = "Network error"
}