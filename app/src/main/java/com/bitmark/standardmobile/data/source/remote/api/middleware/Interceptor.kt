package com.bitmark.standardmobile.data.source.remote.api.middleware

import okhttp3.Interceptor
import okhttp3.Response


/**
 * @author Hieu Pham
 * @since 2019-10-14
 * Email: hieupham@bitmark.com
 * Copyright © 2019 Bitmark. All rights reserved.
 */
abstract class Interceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }

    abstract fun getTag(): String?
}