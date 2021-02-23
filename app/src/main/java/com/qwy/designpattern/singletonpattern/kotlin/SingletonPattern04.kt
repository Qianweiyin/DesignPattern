package com.qwy.designpattern.singletonpattern.kotlin

/**
 * 双重校验锁式（Double Check)
 */
class SingletonPattern04 private constructor() {

    /**
     * 1. 高阶函数
     *
     *
     * 2. 委托属性
     *
     */

    companion object {
        val instance: SingletonPattern04 by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            SingletonPattern04()
        }
    }

}