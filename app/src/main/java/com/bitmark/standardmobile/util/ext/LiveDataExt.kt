package com.bitmark.standardmobile.util.ext

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.MutableLiveData
import com.bitmark.standardmobile.util.livedata.BufferedLiveData


/**
 * @author Hieu Pham
 * @since 2019-10-14
 * Email: hieupham@bitmark.com
 * Copyright © 2019 Bitmark. All rights reserved.
 */

fun <T> MutableLiveData<T>.set(value: T) {
    if (Looper.myLooper() != Looper.getMainLooper()) {
        Handler(Looper.getMainLooper()).post { this.value = value }
    } else {
        this.value = value
    }
}

fun <T> BufferedLiveData<T>.set(value: T) {
    if (Looper.myLooper() != Looper.getMainLooper()) {
        Handler(Looper.getMainLooper()).post { setValue(value) }
    } else {
        setValue(value)
    }
}