package com.qwy.designpattern.lagou.observerdesignpattern.template

/**
 * 定义观察者接口
 */
interface Subject {
    //注册观察者
    fun registerObserver(observer: Observer)
    //删除观察者
    fun removeObserver(observer: Observer)
    //发起通知
    fun notifyObservers(message: Message)


}