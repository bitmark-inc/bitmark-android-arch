package com.bitmark.standardmobile

import android.app.Application
import com.bitmark.standardmobile.data.source.RepositoryModule
import com.bitmark.standardmobile.data.source.remote.api.NetworkModule
import com.bitmark.standardmobile.di.ActivityBuilderModule
import com.bitmark.standardmobile.di.FragmentBuilderModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


/**
 * @author Hieu Pham
 * @since 2019-10-14
 * Email: hieupham@bitmark.com
 * Copyright © 2019 Bitmark. All rights reserved.
 */
@Component(
    modules = [AndroidSupportInjectionModule::class, AppModule::class,
        ActivityBuilderModule::class, FragmentBuilderModule::class,
        NetworkModule::class, RepositoryModule::class]
)
@Singleton
interface AppComponent : AndroidInjector<StandardMobileApplication> {
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(app: Application): Builder

        fun build(): AppComponent

    }
}