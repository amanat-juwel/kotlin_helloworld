package com.example.kotlinhelloworld.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kotlinhelloworld.R
import kotlinx.android.synthetic.main.activity_second.*

// credit: https://www.youtube.com/watch?v=e7WIPwRd2s8&list=PLlxmoA0rQ-Lw5k_QCqVl3rsoJOnb_00UV&index=1

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //Safe Call ?/
        //Safe Call with let ?. let { }

        //start getting data from MainActivity via intent
        val bundle:Bundle? = intent.extras

        //if bundle is null the following code will not be executed and will avoid null point exception
        bundle?.let {
            val user = bundle!!.getString("userName")

            //show user name via textview
            textUserName.text = user

            //toast
            Toast.makeText(this, user, Toast.LENGTH_SHORT).show()
        }

    }
}
