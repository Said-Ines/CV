package com.example.curriculumvitae2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns.EMAIL_ADDRESS
import android.widget.*
import com.google.android.material.textfield.TextInputLayout


/*const val RED = "RED"
const val BLUE = "BLUE"
const val YELLOW = "YELLOW"
const val PURPLE = "PURPLE"
const val GREEN = "GREEN"
const val ORANGE = "ORANGE"

const val NAME = "NAME"
const val MIXED_COLOR = "COLOR"
const val COLOR1 = "COLOR 1"
const val COLOR2 = "COLOR 2"*/

/*const val NAME="NAME"
const val EMAIL="NAME"
const val AGE="NAME"
const val GENDER="NAME"
const val SKILLSA="NAME"
const val SKILLSI="NAME"
const val SKILLSF="NAME"
const val LANG="NAME"
const val HOBB="NAME"*/

class SecondActivity : AppCompatActivity() {
    private var fullName="NONE"
    private var errorName: TextInputLayout?=null
    private var email="NONE"
    private var errorEmail: TextInputLayout?=null
    private var age="NONE"
    private var errorAge: TextInputLayout?=null

    private var male: RadioButton? = null
    private var female: RadioButton? = null

    private var next: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Create your Resume"

        fullName=intent.getStringExtra(NAME).toString()
        errorName=findViewById(R.id.FullName)
        email=intent.getStringExtra(EMAIL).toString()
        errorEmail=findViewById(R.id.Email)
        age=intent.getStringExtra(AGE).toString()
        errorAge=findViewById(R.id.Age)

        male=findViewById(R.id.Male)
        female=findViewById(R.id.Female)
        
        next=findViewById(R.id.Next)
        
        next!!.setOnClickListener { 
            clickNext()
        }

    }

    private fun clickNext() {
        if(validate()){
        val intent = Intent(this,ThirdScreen::class.java).apply {
            putExtra(NAME,fullName)
            putExtra(EMAIL,email)
            putExtra(AGE,age)
        }
        startActivity(intent)
        }

    }

    private fun validate():Boolean {
        /*var name:Boolean=true
        var mail:Boolean=true
        var Age:Boolean=true*/
        /*if(fullName?.text!!.isEmpty()){
            errorName?.error="Must not be empty !"
            name=false
        }
        if(email?.text!!.isEmpty()){
            errorEmail?.error="Must not be empty !"
            mail=false
        }
        if(age?.text!!.isEmpty()){
            errorAge?.error="Must not be empty !"
            Age=false
        }

       *//* if(!male?.isChecked!! && !female?.isChecked!! ){
            Toast.makeText(this, "Choose your gender !", Toast.LENGTH_SHORT).show()
            return false
        }*//*
        if(EMAIL_ADDRESS.matcher(email?.text!!).matches()){
            errorEmail?.error="Check you email !"
            mail= false
        }

        if (name===false || mail===false||Age===false ){
          return false
        }
        return true

    }*/
        return true
    }
}