package com.fredporciuncula.sqldelightdaggerissue.store

import android.content.Context
import com.squareup.sqldelight.android.AndroidSqliteDriver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DbModule {

    @Provides @Singleton
    fun provideDatabase(context: Context): MyDatabase {
        return MyDatabase(AndroidSqliteDriver(MyDatabase.Schema, context, "test.db"))
    }
}
