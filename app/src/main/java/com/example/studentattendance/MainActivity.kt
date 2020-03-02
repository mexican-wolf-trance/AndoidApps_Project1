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

        val info_sec = findViewById<View>(R.id.info_sec) as Button
        val andy_apps = findViewById<View>(R.id.andy_apps) as Button
        val intro = findViewById<View>(R.id.intro_soft) as Button

        andy_apps.setOnClickListener()
        {
            val intent = Intent(this@MainActivity, DetailsActivity::class.java)
            intent.putExtra("button", "1")
            startActivity(intent)
        }

        info_sec.setOnClickListener()
        {
            val intent = Intent(this@MainActivity, DetailsActivity::class.java)
            intent.putExtra("button", "2")
            startActivity(intent)
        }

        intro.setOnClickListener()
        {
            val intent = Intent(this@MainActivity, DetailsActivity::class.java)
            intent.putExtra("button", "3")
            startActivity(intent)
        }
    }
}
