package com.example.curriculumvitae2.User
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [UserEntity::class], version = 1)
abstract class UserDataBase : RoomDatabase()
{
    companion object {
        @Volatile
        private var instance: UserDataBase? = null

        fun getDatabase(context: Context): UserDataBase {
            if (instance == null) {
                synchronized(this) {
                    instance =
                        Room.databaseBuilder(context, UserDataBase::class.java, "champions")
                            .allowMainThreadQueries()
                            .build()
                }
            }
            return instance!!
        }
    }
}