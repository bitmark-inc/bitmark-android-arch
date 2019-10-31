package com.bitmark.standardmobile.util.ext

import android.app.admin.DevicePolicyManager
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import androidx.annotation.DimenRes


/**
 * @author Hieu Pham
 * @since 2019-10-31
 * Email: hieupham@bitmark.com
 * Copyright © 2019 Bitmark. All rights reserved.
 */

fun Context.copyToClipboard(text: String) {
    val clipboardManager =
        getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
    val clip = ClipData.newPlainText("", text)
    clipboardManager.primaryClip = clip
}

fun Context.getResIdentifier(resName: String, classifier: String) = try {
    resources.getIdentifier(resName, classifier, packageName)
} catch (e: Throwable) {
    null
}

fun Context.getString(stringResName: String): String {
    val id = getResIdentifier(stringResName, "string") ?: return ""
    return try {
        getString(id)
    } catch (e: Throwable) {
        ""
    }
}

fun Context.getDimensionPixelSize(@DimenRes dimenRes: Int): Int {
    return try {
        resources.getDimensionPixelSize(dimenRes)
    } catch (e: Throwable) {
        0
    }
}

fun Context.getDimension(@DimenRes dimenRes: Int, default: Float = 0f): Float {
    return try {
        resources.getDimension(dimenRes)
    } catch (e: Throwable) {
        default
    }
}

fun Context.isStorageEncryptionInactive(): Boolean {
    return try {
        val devicePolicyManager =
            getSystemService(Context.DEVICE_POLICY_SERVICE) as DevicePolicyManager
        val status = devicePolicyManager.storageEncryptionStatus
        status == DevicePolicyManager.ENCRYPTION_STATUS_INACTIVE
    } catch (e: Throwable) {
        false
    }
}