package com.yulmaso.featurecomponenttest.di

import android.app.Application
import android.content.Context
import com.yulmaso.featurecomponenttest.data.DataSource
import dagger.Module
import dagger.Provides

/**
 *  Created by yulmaso
 *  Date: 29.06.2021
 */
@Module
open class AppModule(private val app: Application) {

    @Provides
    fun provideContext(): Context = app.applicationContext

    @Provides
    fun provideDataSource(ctx: Context): DataSource = DataSource(ctx)

}