/**
 * SPDX-License-Identifier: ISC
 * Copyright © 2014-2019 Bitmark. All rights reserved.
 * Use of this source code is governed by an ISC
 * license that can be found in the LICENSE file.
 */
package com.bitmark.standardmobile.data.source.local.api

import android.content.Context
import com.google.gson.Gson
import io.reactivex.Completable
import io.reactivex.Single
import io.reactivex.SingleOnSubscribe
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class SharedPrefApi @Inject constructor(
    context: Context, gson: Gson
) {

    private val sharePrefGateway = SharedPrefGateway(context, gson)

    fun <T> rxSingle(action: (SharedPrefGateway) -> T): Single<T> {
        return Single.create(SingleOnSubscribe<T> { e ->
            try {
                e.onSuccess(action.invoke(sharePrefGateway))
            } catch (ex: Exception) {
                e.onError(ex)
            }
        }).subscribeOn(Schedulers.io())
    }

    fun rxCompletable(action: (SharedPrefGateway) -> Unit): Completable {
        return Completable.create { e ->
            try {
                action.invoke(sharePrefGateway)
                e.onComplete()
            } catch (ex: Exception) {
                e.onError(ex)
            }

        }.subscribeOn(Schedulers.io())
    }
}