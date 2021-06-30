package com.yulmaso.featurecomponenttest.data

import javax.inject.Inject
import javax.inject.Singleton

/**
 *  Created by yulmaso
 *  Date: 29.06.2021
 */
@Singleton
class Repository @Inject constructor(
    private val dataSource: DataSource
) {

    fun getString(): String = dataSource.getHelloWorld()

    fun getFeatureString(): String = dataSource.getFeatureHelloWorld()

}