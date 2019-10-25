package com.bitmark.standardmobile.data.source.local.api

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.bitmark.standardmobile.BuildConfig
import com.bitmark.standardmobile.data.model.entity.BitmarkR
import com.bitmark.standardmobile.data.source.local.api.converter.LinkedTreeMapConverter
import com.bitmark.standardmobile.data.source.local.api.dao.BitmarkDao


/**
 * @author Hieu Pham
 * @since 2019-10-22
 * Email: hieupham@bitmark.com
 * Copyright © 2019 Bitmark. All rights reserved.
 */
@Database(
    entities = [BitmarkR::class],
    version = 1
)
@TypeConverters(
    LinkedTreeMapConverter::class
)
abstract class DatabaseGateway : RoomDatabase() {

    companion object {
        const val DATABASE_NAME = BuildConfig.APPLICATION_ID
    }

    abstract fun bitmarkDao(): BitmarkDao

}