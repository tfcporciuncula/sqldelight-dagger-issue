package com.fredporciuncula.sqldelightdaggerissue

import android.content.Context
import com.fredporciuncula.sqldelightdaggerissue.store.DbModule
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DbModule::class])
interface MyComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): MyComponent
    }
}