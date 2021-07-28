package com.qwy.designpattern.observerdesignpattern.template


class ConcreteSubject : Subject {

    //存储被观察者
    private val observers = mutableListOf<Observer>()

    //注册
    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }
    //删除
    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    //发起通知
    override fun notifyObservers(message: Message) {
//        observers.forEach {
//            it.update(message)
//        }

        val mutableListIterator = observers.listIterator()
        mutableListIterator.next().update(message)
    }
}