package com.example.studentattendance

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.courses_layout.*

class DetailsActivity: AppCompatActivity()
{
    //private lateinit var model: AttendanceCalc

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.courses_layout)
        val button = intent.getStringExtra("button")
        when (button)
        {
            "1" ->
            {
                class_instructor.setText(R.string.aa_class_instructor)
                class_id.setText(R.string.aa_class_id)
                class_days.setText(R.string.aa_class_days)
                class_number.setText(R.string.aa_class_number)
            }
            "2" ->
            {
                class_instructor.setText(R.string.ss_class_instructor)
                class_id.setText(R.string.ss_class_id)
                class_days.setText(R.string.online_class_days)
                class_number.setText(R.string.ss_class_number)
            }
            "3" ->
            {
                class_instructor.setText(R.string.itts_class_instructor)
                class_id.setText(R.string.itts_class_id)
                class_days.setText(R.string.online_class_days)
                class_number.setText(R.string.itts_class_number)
            }
        }
        val studentList = findViewById<View>(R.id.student_list) as Button
        val intent = Intent(this@DetailsActivity, StudentList::class.java)

        studentList.setOnClickListener()
        {
            when (button)
            {
                "2" ->
                {
                    intent.putExtra("names", "2")
                }
                "3" ->
                {
                    intent.putExtra("names", "3")
                }
            }
            startActivityForResult(intent, 10)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?)
    {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode != Activity.RESULT_OK)
        {
            return
        }

        when (requestCode)
        {
            10 ->
            {
                val results = findViewById<TextView>(R.id.results)
                val atResults = data?.getDoubleExtra("result", 0.0)
                Toast.makeText(applicationContext, "$atResults", Toast.LENGTH_SHORT).show()
                if (atResults != null && atResults > 0)
                    results.text = "$atResults %"
            }
        }
    }
}