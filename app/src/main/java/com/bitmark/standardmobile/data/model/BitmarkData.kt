package com.bitmark.standardmobile.data.model

import androidx.room.Embedded
import com.bitmark.standardmobile.data.model.entity.BitmarkR


/**
 * @author Hieu Pham
 * @since 2019-10-22
 * Email: hieupham@bitmark.com
 * Copyright © 2019 Bitmark. All rights reserved.
 */
data class BitmarkData(
    @Embedded
    val bitmarkR: BitmarkR
) : Data