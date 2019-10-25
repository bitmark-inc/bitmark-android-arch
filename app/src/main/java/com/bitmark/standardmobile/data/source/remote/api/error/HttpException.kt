package com.bitmark.standardmobile.data.source.remote.api.error


/**
 * @author Hieu Pham
 * @since 2019-10-14
 * Email: hieupham@bitmark.com
 * Copyright © 2019 Bitmark. All rights reserved.
 */
class HttpException(val code: Int) : Exception() {
    override val message: String?
        get() = "HTTP error $code"
}