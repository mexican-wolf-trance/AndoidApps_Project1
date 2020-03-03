package com.example.studentattendance

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.student_list.*

class StudentList: AppCompatActivity()
{
    var buttonChecker = true

    private lateinit var model: AttendanceCalc

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.student_list)

        if (!::model.isInitialized){model = AttendanceCalc()}

        when (intent.getStringExtra("names"))
        {
            "2" ->
            {
                sname1.setText(R.string.student_name6)
                sname2.setText(R.string.student_name9)
                sname3.setText(R.string.student_name12)
                sname4.setText(R.string.student_name8)
                sname5.setText(R.string.student_name7)
            }
            "3" ->
            {
                sname1.setText(R.string.student_name4)
                sname2.setText(R.string.student_name2)
                sname3.setText(R.string.student_name12)
                sname4.setText(R.string.student_name10)
                sname5.setText(R.string.student_name11)
            }
        }

        val studentList = findViewById<LinearLayout>(R.id.sl_layout) as LinearLayout
        val buttonPresent = Button(this)
        buttonPresent.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        buttonPresent.text = "PRESENT"

        val buttonAbsent = Button(this)
        buttonAbsent.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        buttonAbsent.text = "ABSENT"

        val buttonLate = Button(this)
        buttonLate.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        buttonLate.text = "LATE"

        val buttonUnknown = Button(this)
        buttonUnknown.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        buttonUnknown.text = "UNKNOWN"

        fun destroyButton()
        {
            studentList.removeView(buttonPresent)
            studentList.removeView(buttonAbsent)
            studentList.removeView(buttonUnknown)
            studentList.removeView(buttonLate)
            this.buttonChecker = true
        }

        buttonPresent.setOnClickListener()
        {
            model.setAttend(1)
            Toast.makeText(applicationContext,"PRESENT:" + model.getAttend(), Toast.LENGTH_SHORT).show()
            destroyButton()
        }

        buttonAbsent.setOnClickListener()
        {
            model.setAbsent(1)
            Toast.makeText(applicationContext,"ABSENT:" + model.getAbsent(), Toast.LENGTH_SHORT).show()
            destroyButton()
        }

        buttonUnknown.setOnClickListener()
        {
            model.setUnknown(1)
            Toast.makeText(applicationContext, "UNKNOWN (counts as absent):" + model.getAbsent(), Toast.LENGTH_SHORT).show()
            destroyButton()
        }
        buttonLate.setOnClickListener()
        {
            model.setLate(1)
            Toast.makeText(applicationContext, "LATE: " + model.getAbsent(), Toast.LENGTH_SHORT).show()
            destroyButton()
        }
        resetButton.setOnClickListener()
        {
            model.reset()
            Toast.makeText(applicationContext, "RESET", Toast.LENGTH_SHORT).show()
        }
        finish.setOnClickListener()
        {
            finish()
        }

        fun createButton()
        {
            if (this.buttonChecker)
            {
                studentList.addView(buttonPresent)
                studentList.addView(buttonAbsent)
                studentList.addView(buttonUnknown)
                studentList.addView(buttonLate)
                this.buttonChecker = false
            }
            else
                Toast.makeText(applicationContext,"You must select PRESENT or ABSENT", Toast.LENGTH_SHORT).show()
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