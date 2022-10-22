package com.example.curriculumvitae2.User

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Users")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,

    @ColumnInfo(name = "fullName")
     val fullName : String,

    @ColumnInfo(name = "email")
    val email : String,

    @ColumnInfo(name = "age")
    val age : String,

    @ColumnInfo(name = "gender")
    val gender : String,

    @ColumnInfo(name = "Android skill")
    val skillAndroid : Int,

    @ColumnInfo(name = "Ios skill")
    val skillIos : Int,

    @ColumnInfo(name = "Flutter skill")
    val skillFlutter : Int,

    @ColumnInfo(name = "languages")
    val lang : String,

    @ColumnInfo(name = "hobbies")
    val hob : String


)
