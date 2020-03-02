package com.example.studentattendance

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.courses_layout.*

class DetailsActivity: AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.courses_layout)

        when (intent.getStringExtra("button"))
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
            startActivity(intent)
        }
    }
}