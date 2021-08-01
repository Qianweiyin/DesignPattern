package com.qwy.designpattern.lagou.singletonpattern.kotlin

/**
 * 线程安全的懒汉式
 */
class SingletonPattern03 private constructor() {


    companion object {
        private var instance: SingletonPattern03? = null
            get() {
                if (field == null) {
                    field = SingletonPattern03()
                }
                return field
            }

        @Synchronized
        fun get(): SingletonPattern03 {
            return instance!!
        }


    }

}