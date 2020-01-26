package com.example.kotlinhelloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToastBtn.setOnClickListener {
            Log.i("MainActivity", "Hello from the world of Kotlin!")
            Toast.makeText(this, "Button was clicked!", Toast.LENGTH_SHORT).show()
        }

        //Share Data between Activities using Explicit Intent
        sendDataToSecondActivityBtn.setOnClickListener {
            //get data of user input
            val username: String = et_username.text.toString()
            //Toast.makeText(this, username, Toast.LENGTH_SHORT).show()

            //start passing data to another activity
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("userName", username)
            startActivity(intent)
            //end passing data to another activity
        }

        //Share Data between Activities using Implicit Intent
        shareDataBtn.setOnClickListener {
            //get data of user input
            val username: String = et_username.text.toString()

            //start sharing data to another android app
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, username)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share To: "))
            //end sharing data to another android app
        }
    }
}
