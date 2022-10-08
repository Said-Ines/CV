package com.example.curriculumvitae2

import android.os.Bundle
import android.text.TextUtils.replace
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class FourthActivity : AppCompatActivity() {

    private lateinit var userMail : TextView
    private lateinit var nameLabel : TextView
    private lateinit var profilePic : TextView


    private var skillsButton : Button? = null
    private var hobbiesButton : Button? = null
    private var languageButton : Button? = null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        supportActionBar?.title = "Your Resume"

        skillsButton = findViewById(R.id.Skills_button)
        hobbiesButton = findViewById(R.id.Hobbies_button)
        languageButton = findViewById(R.id.Language_button)

        userMail = findViewById(R.id.User_mail)
        nameLabel = findViewById(R.id.Name_label)
        profilePic = findViewById(R.id.Profile_Pic)

        skillsButton!!.setOnClickListener()
        {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.Skills_fragment,skills.newInstance())
            transaction.commit()
        }

        hobbiesButton!!.setOnClickListener()
        {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.Skills_fragment,hobbies.newInstance())
            transaction.commit()
        }




//        resume = findViewById(R.id.resume)
//
//        val skillAndroid = intent.getStringExtra(ANDROID).toString()
//        val skillIos = intent.getStringExtra(IOS).toString()
//        val skillFlutter = intent.getStringExtra(FLUTTER).toString()
//        val lang =intent.getStringExtra(LANG).toString()
//        val hob =intent.getStringExtra(HOB).toString()
//
//        val name =  intent.getStringExtra(NAME1).toString()
//        val age =  intent.getStringExtra(AGE1).toString()
//        val email = intent.getStringExtra(EMAIL1).toString()
//        val gender =  intent.getStringExtra(GENDER1).toString()
//
//        resume.setText("Name : $name \n Email : $email \n Age : $age \n Gender : $gender \n AndroidSkill : $skillAndroid \n IosSkill : $skillIos \n FlutterSkill : $skillFlutter \n Languages : $lang \n Hobbies : $hob ").toString()

    }
}