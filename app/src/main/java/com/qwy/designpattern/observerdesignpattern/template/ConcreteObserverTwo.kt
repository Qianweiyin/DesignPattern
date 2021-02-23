package com.qwy.designpattern.observerdesignpattern.template

import android.os.Message

class ConcreteObserverTwo : Observer {
    override fun update(message: Message) {
        //TODO: 获取消息通知，执行自己的逻辑...
        println("ConcreteObserverTwo is notified.")
    }
}