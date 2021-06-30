package com.yulmaso.featurecomponenttest.data

import android.content.Context

/**
 *  Created by yulmaso
 *  Date: 29.06.2021
 */
class DataSource constructor(
    private val context: Context
) {
    fun getHelloWorld(): String {
        return "Hello Dagger World!"
    }

    fun getFeatureHelloWorld(): String {
        return "Hello FEATURE World!"
    }
}