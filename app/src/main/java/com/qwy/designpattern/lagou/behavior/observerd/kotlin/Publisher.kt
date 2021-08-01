package com.qwy.designpattern.lagou.behavior.observerd.kotlin

import java.util.*

interface Publisher {
    fun addObserver(o: Observer?)
    fun removeObserver(o: Observer?)
    fun notify(amt: Double)
}