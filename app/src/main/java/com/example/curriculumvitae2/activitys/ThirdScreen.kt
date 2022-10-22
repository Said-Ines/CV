package com.example.curriculumvitae2.activitys

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.SeekBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.curriculumvitae2.R

const val USER_DATA = "USER DATA"

const val IOS = "100"
const val ANDROID = "none"
const val FLUTTER= ""
const val LANG = "lang"
const val HOB = "hob"

const val NAME1 = "NAME"
const val EMAIL1 = "EMAIL"
const val AGE1 = "age"
const val GENDER1 = "GENDER"

const val IS_REMEMBRED = "IS_REMEMBRED"

class ThirdScreen : AppCompatActivity()
{

    private var seekBarAndroid: SeekBar? = null
    private var seekBarIos: SeekBar? = null
    private var seekBarFlutter: SeekBar? = null

    private var btnSubmit : Button? = null

    private var arabic : CheckBox? = null
    private var english : CheckBox? = null
    private var music : CheckBox? = null
    private var sport : CheckBox? = null
    private var games : CheckBox? = null
    private var french : CheckBox? = null

    private var rememberMe : CheckBox? = null

    lateinit var mSharedPref: SharedPreferences



    override fun onCreate(savedInstanceState: Bundle?)
    {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_screen)
        supportActionBar?.title = " Create Your Resume"

        seekBarAndroid= findViewById(R.id.SeekBarAndr2)
        seekBarIos= findViewById(R.id.SeekBarIos2)
        seekBarFlutter= findViewById(R.id.SeekBarFlutter2)

        btnSubmit= findViewById(R.id.Submit)

        arabic= findViewById(R.id.arabic)
        english= findViewById(R.id.english)
        music= findViewById(R.id.music)
        games= findViewById(R.id.games)
        sport= findViewById(R.id.sport)
        french= findViewById(R.id.french)

        rememberMe= findViewById(R.id.RememberMe)

        mSharedPref = getSharedPreferences(USER_DATA, MODE_PRIVATE);






        btnSubmit!!.setOnClickListener()
        {
            clickSubmit()
        }


    }



    private fun clickSubmit()
    {
        if(validate2())
        {
            val name =  intent.getStringExtra(NAME).toString()
            val age =  intent.getStringExtra(AGE).toString()
            val email = intent.getStringExtra(EMAIL).toString()
            val gender =  intent.getStringExtra(GENDER).toString()
            val skillAndroid = seekBarAndroid?.progress!!.toFloat()
            val skillIos = seekBarIos?.progress!!.toFloat()
            val skillFlutter = seekBarFlutter?.progress!!.toFloat()

            val ios = "$skillIos"
            val and = "$skillAndroid"
            val fltr= "$skillFlutter"
            var lang =""
            var hob =""

            if(arabic?.isChecked!!)
            {
                lang+=" Arabic"
            }
            if(french?.isChecked!!)
            {
                lang += " French"
            }
            if(english?.isChecked!!)
            {
                lang+=" English"
            }

            if(music?.isChecked!!)
            {
                hob+=" Music"
            }
            if(sport?.isChecked!!)
            {
                hob+= " Sport"
            }
            if(games?.isChecked!!)
            {
                hob+=" Games"
            }

            if (mSharedPref.getBoolean(IS_REMEMBRED, false)){
                navigate()
            }


//            val intent = Intent(this,FourthActivity::class.java).apply{
//                putExtra(IOS,ios)
//                putExtra(ANDROID,and)
//                putExtra(FLUTTER,fltr)
//                putExtra(LANG,lang)
//                putExtra(HOB,hob)
//                putExtra(NAME1,name)
//                putExtra(EMAIL1,email)
//                putExtra(AGE1,age)
//                putExtra(GENDER1,gender)
//            }
//            startActivity(intent)
        }
    }

    private fun validate2():Boolean
    {
        if (rememberMe!!.isChecked){
            //TODO 4 "Edit the SharedPreferences by putting all the data"
            mSharedPref.edit().apply{
                putBoolean(IS_REMEMBRED, true)
                putInt(ANDROID, seekBarAndroid!!.progress)
                putInt(IOS, seekBarIos!!.progress)
                putInt(FLUTTER, seekBarFlutter!!.progress)
                putBoolean(IS_REMEMBRED, true)
            }.apply()}
        if(!arabic?.isChecked!! && !english?.isChecked!! && !french?.isChecked!! )
        {
            Toast.makeText(this, "Choose one language at least !", Toast.LENGTH_SHORT).show()
            return false
        }
        if(!music?.isChecked!! && !games?.isChecked!! && !sport?.isChecked!! )
        {
            Toast.makeText(this, "Choose one hobby at least !", Toast.LENGTH_SHORT).show()
            return false
        }
      return true
    }

    private fun navigate()
    {
        val mainIntent = Intent(this, FourthActivity::class.java)
        startActivity(mainIntent)
    }
}