package com.example.studentattendance

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class StudentList: AppCompatActivity()
{
    var buttonChecker = true
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.student_list)

        val studentList = findViewById<LinearLayout>(R.id.sl_layout) as LinearLayout
        val buttonPresent = Button(this)
        buttonPresent.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        buttonPresent.text = "PRESENT"

        val buttonAbsent = Button(this)
        buttonAbsent.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        buttonAbsent.text = "ABSENT"

        fun destroyButton()
        {
            studentList.removeView(buttonPresent)
            studentList.removeView(buttonAbsent)
            this.buttonChecker = true
        }

        buttonPresent.setOnClickListener()
        {
            destroyButton()
        }

        buttonAbsent.setOnClickListener()
        {
            destroyButton()
        }

        fun createButton()
        {
            if (this.buttonChecker)
            {
                studentList.addView(buttonPresent)
                studentList.addView(buttonAbsent)
                this.buttonChecker = false
            }
            else
                Toast.makeText(applicationContext,"You mus select PRESENT or ABSENT", Toast.LENGTH_SHORT).show()
        }

        val student1 = findViewById<View>(R.id.sname1)
        val student2 = findViewById<View>(R.id.sname2)
        val student3 = findViewById<View>(R.id.sname3)
        val student4 = findViewById<View>(R.id.sname4)
        val student5 = findViewById<View>(R.id.sname5)

        student1.setOnClickListener()
        {
            createButton()
        }
        student2.setOnClickListener()
        {
            createButton()
        }
        student3.setOnClickListener()
        {
            createButton()
        }
        student4.setOnClickListener()
        {
            createButton()
        }
        student5.setOnClickListener()
        {
            createButton()
        }


    }
}