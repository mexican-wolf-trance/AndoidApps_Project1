package com.example.studentattendance

import android.widget.Toast
import java.security.AccessController.getContext

class AttendanceCalc()
{
    private var attending: Int
    private var absent: Int
    private var late: Int
    private val total: Int
    var attPercent: Double = 0.0
    var absPercent: Double = 0.0


    init
    {
        this.absent = 0
        this.attending = 0
        this.late = 0

        this.total = 5
    }

    fun setAttend(x: Int)
    {
        if (this.attending + this.late + this.absent < this.total)
            this.attending += x
    }
    fun setAbsent(x: Int)
    {
        if (this.attending + this.late + this.absent < this.total)
            this.absent += x
    }
    fun setUnknown(x: Int)
    {
        if (this.attending + this.late + this.absent < this.total)
        this.absent += x
    }
    fun setLate(x: Int)
    {
        if (this.attending + this.late + this.absent < this.total)
            this.late += x
    }
    fun getAttend(): Int
    {
        return this.attending
    }
    fun getAbsent(): Int
    {
        return this.absent
    }

    fun setValues()
    {
        this.attPercent = (attending.toDouble() / total.toDouble()) * 100
        this.absPercent = (absent.toDouble() / total.toDouble()) * 100
    }

    fun getPercent(num: Int): Double
    {
        return when (num) {
            1 -> {this.attPercent}
            2 -> {this.absPercent}
            else -> {0.0}
        }

    }
}