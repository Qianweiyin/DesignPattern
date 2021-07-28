package com.qwy.designpattern.observerdesignpattern.template

//被观察者实现1
class ConcreteObserverOne : Observer {
    //接收通知
    override fun update(message: Message) {
        //TODO: 获取消息通知，执行自己的逻辑...
        println("ConcreteObserverOne is notified.")
    }
}