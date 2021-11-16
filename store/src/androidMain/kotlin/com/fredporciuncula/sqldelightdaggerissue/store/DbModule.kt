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

    @Provides
    fun provideQueries1(database: MyDatabase): Queries1Queries {
        return database.queries1Queries
    }

    // To induce the error, create a new `Queries2.sq` file, uncomment this provides, and build the project.
    // You can keep adding new files and new provides methods to keep bringing the error back.
//    @Provides
//    fun provideQueries2(database: MyDatabase): Queries2Queries {
//        return database.queries2Queries
//    }
}
