package com.example.curriculumvitae2

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText


class FourthActivity : AppCompatActivity() {

    private lateinit var resume : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        supportActionBar?.title = "Your Resume"

        resume = findViewById(R.id.resume)

        val skillAndroid = intent.getStringExtra(ANDROID).toString()
        val skillIos = intent.getStringExtra(IOS).toString()
        val skillFlutter = intent.getStringExtra(FLUTTER).toString()
        val lang =intent.getStringExtra(LANG).toString()
        val hob =intent.getStringExtra(HOB).toString()

        val name =  intent.getStringExtra(NAME1).toString()
        val age =  intent.getStringExtra(AGE1).toString()
        val email = intent.getStringExtra(EMAIL1).toString()
        val gender =  intent.getStringExtra(GENDER1).toString()

        resume.setText("Name : $name \n Email : $email \n Age : $age \n Gender : $gender \n AndroidSkill : $skillAndroid \n IosSkill : $skillIos \n FlutterSkill : $skillFlutter \n Languages : $lang \n Hobbies : $hob ").toString()

    }
}