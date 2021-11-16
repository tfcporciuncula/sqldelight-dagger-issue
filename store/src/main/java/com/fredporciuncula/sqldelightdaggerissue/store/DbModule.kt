package com.fredporciuncula.sqldelightdaggerissue.store

import android.content.Context
import com.squareup.sqldelight.android.AndroidSqliteDriver
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DbModule {

    @Provides @Singleton
    fun provideDatabase(@ApplicationContext context: Context): Database {
        return Database(AndroidSqliteDriver(Database.Schema, context, "test.db"))
    }
}
