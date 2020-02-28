package com.example.studentattendance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Toast
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val info_sec = findViewById<View>(R.id.info_sec)

        info_sec.setOnClickListener()
        {
            val intent = Intent(this@MainActivity, DetailsActivity::class.java)
            startActivity(intent)
        }

//        val aaButton = findViewById<Button>(R.id.aa_class_button)
//
//        aaButton?.setOnClickListener()
//        {
//            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
//        }


    }
}
