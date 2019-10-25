package com.bitmark.standardmobile.data.source.local

import com.bitmark.standardmobile.data.source.local.api.DatabaseApi
import com.bitmark.standardmobile.data.source.local.api.FileStorageApi
import com.bitmark.standardmobile.data.source.local.api.SharedPrefApi


/**
 * @author Hieu Pham
 * @since 2019-10-14
 * Email: hieupham@bitmark.com
 * Copyright © 2019 Bitmark. All rights reserved.
 */
abstract class LocalDataSource(
    protected val databaseApi: DatabaseApi,
    protected val sharedPrefApi: SharedPrefApi,
    protected val fileStorageApi: FileStorageApi
)