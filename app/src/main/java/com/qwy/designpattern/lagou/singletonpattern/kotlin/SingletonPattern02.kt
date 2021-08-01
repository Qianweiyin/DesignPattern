package com.qwy.designpattern.lagou.singletonpattern.kotlin

/**
 * 懒汉式
 */
class SingletonPattern02 private constructor() {


    /**
     * 1. Kotlin构造函数
     *
     *
     * 2. Kotlin的属性与访问器（属性和字段）
     *
     *
     */

    companion object {
        private var instance: SingletonPattern02? = null
            get() {

                if (field == null) {
                    field = SingletonPattern02()
                }

                return field
            }

        fun get(): SingletonPattern02 {
            //细心的小伙伴肯定发现了，
            // 这里你用getInstance作为方法名，
            //是因为在半生对象声明时，内部已有getInstance方法，
            //所以只能取其他名字
            return instance!!
        }
    }


}