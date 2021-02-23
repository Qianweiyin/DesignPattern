package com.qwy.designpattern.observerdesignpattern.template

import android.os.Message

class ConcreteSubject : Subject {


    private val observers = mutableListOf<Observer>()

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers(message: Message) {
//        observers.forEach {
//            it.update(message)
//        }

        val mutableListIterator = observers.listIterator()
        mutableListIterator.next().update(message)
    }
}