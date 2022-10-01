package com.example.curriculumvitae2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


const val IOS = "100"
const val ANDROID = "100"
const val FLUTTER= "100"
const val LANG = "lang"
const val HOB = "hob"

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



    override fun onCreate(savedInstanceState: Bundle?)
    {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_screen)

        seekBarAndroid= findViewById(R.id.SeekBarAndr)
        seekBarIos= findViewById(R.id.SeekBarIos)
        seekBarFlutter= findViewById(R.id.SeekBarFlutter)

        btnSubmit= findViewById(R.id.Submit)

        arabic= findViewById(R.id.arabic)
        english= findViewById(R.id.english)
        music= findViewById(R.id.music)
        games= findViewById(R.id.games)
        sport= findViewById(R.id.sport)
        french= findViewById(R.id.french)

        btnSubmit!!.setOnClickListener()
        {
            clickSubmit()
        }
    }

    private fun clickSubmit()
    {
        if(validate2())
        {
            val skillAndroid = seekBarAndroid?.progress!!
            val skillIos = seekBarIos?.progress!!
            val skillFlutter = seekBarFlutter?.progress!!



            var ios = skillIos.toString()
            var and = skillAndroid.toString()
            var fltr= skillFlutter.toString()
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


            val intent = Intent(this,FourthActivity::class.java).apply{
                putExtra(IOS,ios)
                putExtra(ANDROID,and)
                putExtra(FLUTTER,fltr)
                putExtra(LANG,lang)
                putExtra(HOB,hob)
            }
            startActivity(intent)
        }
    }

    private fun validate2():Boolean
    {
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
}