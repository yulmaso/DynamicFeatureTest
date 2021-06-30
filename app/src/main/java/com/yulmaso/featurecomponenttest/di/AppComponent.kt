package com.yulmaso.featurecomponenttest.di

import android.content.Context
import com.yulmaso.featurecomponenttest.data.Repository
import dagger.Component
import javax.inject.Singleton

/**
 *  Created by yulmaso
 *  Date: 29.06.2021
 */
@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun context(): Context
    fun repository(): Repository

    fun getActivityComponent(): ActivityComponent

}