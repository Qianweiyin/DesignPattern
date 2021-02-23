package com.qwy.designpattern.observerdesignpattern.template

import android.os.Message

interface Subject {

    fun registerObserver(observer: Observer)

    fun removeObserver(observer: Observer)

    fun notifyObservers(message: Message)


}