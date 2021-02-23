package com.qwy.designpattern.singletonpattern;


import com.qwy.designpattern.singletonpattern.java.SingletonPattern01;

import java.lang.reflect.Constructor;

/**
 * 破坏懒汉式单例与饿汉式单例
 * <p>
 * 无论是完美的懒汉式还是饿汉式，终究敌不过反射和序列化，
 * 它们俩都可以把单例对象破坏掉（产生多个对象）。
 * <p>
 * 利用反射破坏单例模式
 */


public class ReflexDemo {


    /**
     *
     * 利用反射，强制访问类的私有构造器，去创建另一个对象
     *
     * @param args
     */

    public static void main(String[] args) {

        try {
            //获取类的显示构造器
            Constructor<SingletonPattern01> constructor = SingletonPattern01.class.getDeclaredConstructor();

            //可访问私有构造器
            constructor.setAccessible(true);


            //利用反射构造新对象
            SingletonPattern01 obj1 = constructor.newInstance();

            //通过正常方式获取单例对象
            SingletonPattern01 obj2 = SingletonPattern01.getInstance();


            System.out.println("破坏懒汉式单例与饿汉式单例 :  " + (obj1 == obj2));


        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
