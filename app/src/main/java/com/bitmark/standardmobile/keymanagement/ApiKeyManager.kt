package com.bitmark.standardmobile.keymanagement


/**
 * @author Hieu Pham
 * @since 2019-10-14
 * Email: hieupham@bitmark.com
 * Copyright © 2019 Bitmark. All rights reserved.
 */
internal class ApiKeyManager {

    val bitmarkApiKey: String
        external get

    companion object {

        val API_KEY_MANAGER = ApiKeyManager()

        init {
            System.loadLibrary("api-key")
        }
    }
}