package com.yulmaso.featurecomponenttest.di

import com.yulmaso.featurecomponenttest.MainActivity
import com.yulmaso.featurecomponenttest.MainFragment
import dagger.Subcomponent

/**
 *  Created by yulmaso
 *  Date: 29.06.2021
 */
@Subcomponent
interface ActivityComponent {

    fun inject(target: MainActivity)
    fun inject(target: MainFragment)

}