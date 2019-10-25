package com.bitmark.standardmobile.util.ext

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import org.json.JSONArray


/**
 * @author Hieu Pham
 * @since 2019-10-14
 * Email: hieupham@bitmark.com
 * Copyright © 2019 Bitmark. All rights reserved.
 */

inline fun <reified T> Gson.fromJson(json: String) =
    this.fromJson<T>(json, object : TypeToken<T>() {}.type)

inline fun <reified T> Gson.toJson(value: T) =
    this.toJson(value, object : TypeToken<T>() {}.type)

fun Map<String, String>.toJson() = Gson().toJson(this)

fun JSONArray.toStringArray() = try {

    val array = Array(length()) { "" }
    for (i in (0 until length())) {
        array[i] = get(i).toString()
    }
    array

} catch (e: Throwable) {
    null
}
