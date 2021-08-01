package com.qwy.designpattern.lagou.behavior.observerd.kotlin

import java.util.*


class PublisherImpl : Publisher {
    private var acct: String? = null
    private var balance = 0.0



    fun PublisherImpl(anAcct: String, aBalance: Double) {
        acct = anAcct
        balance = aBalance
//        myObservers = ArrayList()
    }

    override fun addObserver(o: Observer?) {
        TODO("Not yet implemented")
    }

    override fun removeObserver(o: Observer?) {
        TODO("Not yet implemented")
    }


    override fun notify(amt: Double) {
        TODO("Not yet implemented")
    }
}