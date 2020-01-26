package com.example.kotlinhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //start getting data from MainActivity via intent
        val bundle:Bundle? = intent.extras
        val user = bundle!!.getString("userName")
        //end getting data from MainActivity via intent

        //show user name via textview
        textUserName.text = user

        //toast
        Toast.makeText(this, user, Toast.LENGTH_SHORT).show()

    }
}
