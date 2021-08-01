package com.qwy.designpattern.lagou.observerdesignpattern.template

/**
 * 定义被观察者接口
 */
interface Observer {
    fun update(message: Message)
}