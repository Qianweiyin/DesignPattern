package com.qwy.designpattern.observerdesignpattern.template

/**
 * 定义被观察者接口
 */
interface Observer {
    fun update(message: Message)
}