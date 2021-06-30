package com.yulmaso.featurecomponenttest

import android.app.Application
import com.yulmaso.featurecomponenttest.di.AppComponent
import com.yulmaso.featurecomponenttest.di.AppModule
import com.yulmaso.featurecomponenttest.di.DaggerAppComponent

/**
 *  Created by yulmaso
 *  Date: 29.06.2021
 */
class App: Application() {

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        component = createComponent()
    }

    private fun createComponent(): AppComponent {
        return DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }

}