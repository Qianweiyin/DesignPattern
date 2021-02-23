package com.qwy.designpattern.singletonpattern.kotlin

/**
 * 静态内部类式
 */
class SingletonPattern05 {

    companion object {
        val instance = SingletonHolder.holder
    }


    private object SingletonHolder {
        val holder = SingletonPattern05()
    }


}