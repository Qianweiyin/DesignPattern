package com.qwy.designpattern.lagou.observerdesignpattern.template
//被观察者实现2
class ConcreteObserverTwo : Observer {
    //接收通知
    override fun update(message: Message) {
        //TODO: 获取消息通知，执行自己的逻辑...
        println("ConcreteObserverTwo is notified.")
    }
}