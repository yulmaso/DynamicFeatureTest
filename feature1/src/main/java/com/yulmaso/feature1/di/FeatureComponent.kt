package com.yulmaso.feature1.di

import com.yulmaso.feature1.FeatureFragment
import com.yulmaso.featurecomponenttest.di.AppComponent
import dagger.Component

/**
 *  Created by yulmaso
 *  Date: 29.06.2021
 */
@FeatureScope
@Component(dependencies = [AppComponent::class])
interface FeatureComponent {

    @Component.Factory
    interface Factory {
        fun create(appComponent: AppComponent): FeatureComponent
    }

    fun inject(target: FeatureFragment)
}