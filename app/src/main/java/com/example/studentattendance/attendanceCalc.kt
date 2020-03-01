package com.example.studentattendance

class AttendanceCalcKt() {
    private var attending: Int
    private var absent: Int
    private var unknown: Int
    private val total: Int
    var attPercent: Double = 0.0
    var absPercent: Double = 0.0
    var unkPercent: Double = 0.0


    init {
        this.absent = 0
        this.attending = 0
        this.unknown = 0
        this.total = 20
    }

    fun setValues(x: Int, y: Int, z: Int)
    {
        this.attending = x
        this.absent = y
        this.unknown = z

        this.attPercent = attending.toDouble() / total.toDouble()
        this.absPercent = absent.toDouble() / total.toDouble()
        this.unkPercent = unknown.toDouble() / total.toDouble()
    }
    fun getPercent(num: Int): Double {
        return when (num) {
            1 -> {this.attPercent}
            2 -> {this.absPercent}
            3 -> {this.unkPercent}
            else -> {0.0}
        }

    }
}