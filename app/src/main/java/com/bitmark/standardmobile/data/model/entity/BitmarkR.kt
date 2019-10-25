package com.bitmark.standardmobile.data.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose


/**
 * @author Hieu Pham
 * @since 2019-10-22
 * Email: hieupham@bitmark.com
 * Copyright © 2019 Bitmark. All rights reserved.
 */
@Entity(tableName = "Bitmark")
data class BitmarkR(
    @Expose
    @PrimaryKey
    val id: String
) : Record