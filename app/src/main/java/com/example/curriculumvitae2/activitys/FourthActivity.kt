package com.example.curriculumvitae2.activitys

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.curriculumvitae2.Fragments.hobbies
import com.example.curriculumvitae2.Fragments.skills
import com.example.curriculumvitae2.R


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

        val skillAndroid = intent.getStringExtra(ANDROID)
        val skillIos = intent.getStringExtra(IOS).toString()
        val skillFlutter = intent.getStringExtra(FLUTTER).toString()
        val lang =intent.getStringExtra(LANG).toString()
        val hob =intent.getStringExtra(HOB).toString()

        val name =  intent.getStringExtra(NAME1).toString()
        val age =  intent.getStringExtra(AGE1).toString()
        val email = intent.getStringExtra(EMAIL1).toString()
        val gender =  intent.getStringExtra(GENDER1).toString()

        skillsButton!!.setOnClickListener()
        {
            val fragInfo = skills()
            val bundle = Bundle()
            fragInfo.setArguments(bundle)
        }
        supportFragmentManager.beginTransaction().add(R.id.fragment, skills()).commit()

        hobbiesButton!!.setOnClickListener()
        {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment, hobbies.newInstance())
            transaction.commit()
        }





//        resume = findViewById(R.id.resume)
//






    }

    private fun changeFragment(fragment: Fragment, name: String) {

        if (name.isEmpty())
            supportFragmentManager.beginTransaction().replace(R.id.fragment, fragment).commit()
        else
            supportFragmentManager.beginTransaction().replace(R.id.fragment, fragment).addToBackStack(name).commit()

    }
}