package com.qwy.designpattern.singletonpattern;

import com.qwy.designpattern.singletonpattern.java.SingletonPattern07;
import com.qwy.designpattern.singletonpattern.kotlin.SingletonPattern06;

public class Demo {

    public static void main(String[] args) {


        test();


        kotlinEnum();

    }

    private static void kotlinEnum() {
        String bad_gateway = SingletonPattern06.BAD_GATEWAY.getMsg();
        System.out.println("bad_gateway：" + bad_gateway);
    }


    public static void test() {
        SingletonPattern07 s1 = SingletonPattern07.SINGLETON_PATTERN_07;
        SingletonPattern07 s2 = SingletonPattern07.SINGLETON_PATTERN_07;
        System.out.println("t1和t2的地址是否相同：" + (s1 == s2));
    }

}
