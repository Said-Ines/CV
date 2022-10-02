package com.example.curriculumvitae2

import android.content.Intent
import android.os.Bundle
import android.util.Patterns.EMAIL_ADDRESS
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

const val NAME = "NAME"
const val EMAIL = "EMAIL"
const val AGE = "age"
const val GENDER = "GENDER"


class SecondActivity : AppCompatActivity()
{
    private var fullName : TextInputEditText? = null
    private var email : TextInputEditText? = null
    private var age : TextInputEditText? = null

    private var btnNext : Button? = null

    private var male : RadioButton? = null
    private var female : RadioButton? = null

    private var errorName: TextInputLayout?=null
    private var errorEmail: TextInputLayout?=null
    private var errorAge: TextInputLayout?=null


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Create your Resume"

        fullName = findViewById(R.id.fullName)
        email = findViewById(R.id.email)
        age = findViewById(R.id.age)
        btnNext = findViewById(R.id.Next)
        male = findViewById(R.id.Male)
        female = findViewById(R.id.Female)

        errorName= findViewById(R.id.FullName)
        errorEmail= findViewById(R.id.Email)
        errorAge=findViewById(R.id.Age)

        btnNext!!.setOnClickListener()
        {
            clickNext()
        }
    }

    private fun clickNext()
    {
        if(validate())
        {

            val nAme = fullName!!.text.toString()
            val aGe = email!!.text.toString()
            val eMail = age!!.text.toString()
            val gEnder = if(male?.isChecked!!) {
                "Male"
            } else "Female"

            val intent = Intent(this,ThirdScreen::class.java).apply{
                putExtra(NAME,nAme)
                putExtra(EMAIL,eMail)
                putExtra(AGE,aGe)
                putExtra(GENDER,gEnder)
        }
        startActivity(intent)
        }
    }

    private fun validate():Boolean
    {
        var name:Boolean=true
        var mail:Boolean=true
        var aGe:Boolean=true

        errorName?.error =null
        errorEmail?.error =null
        errorAge?.error =null

        if(fullName?.text!!.isEmpty())
        {
            errorName?.error="Must not be empty !"
            name=false
        }
        if(email?.text!!.isEmpty())
        {
            errorEmail?.error="Must not be empty !"
            mail=false
        }
        if(age?.text!!.isEmpty())
        {
            errorAge?.error="Must not be empty !"
            aGe=false
        }

        if(!male?.isChecked!! && !female?.isChecked!! )
        {
            Toast.makeText(this, "Choose your gender !", Toast.LENGTH_SHORT).show()
            return false
        }
        if(!EMAIL_ADDRESS.matcher(email?.text!!).matches() && fullName?.text!!.isNotEmpty())
        {

            errorEmail?.error="Check you email !"
            mail= false
        }

        if (name===false || mail===false||aGe===false )
        {
          return false
        }
        return true
    }
}