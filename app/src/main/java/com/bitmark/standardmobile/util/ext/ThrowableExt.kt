package com.bitmark.standardmobile.util.ext

import com.bitmark.standardmobile.data.source.remote.api.error.HttpException
import com.bitmark.standardmobile.data.source.remote.api.error.NetworkException


/**
 * @author Hieu Pham
 * @since 2019-10-14
 * Email: hieupham@bitmark.com
 * Copyright © 2019 Bitmark. All rights reserved.
 */

fun Throwable.isNetworkError() = this is NetworkException

fun Throwable.isHttpError() = this is HttpException