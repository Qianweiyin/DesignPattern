package com.qwy.designpattern.singletonpattern;

import com.qwy.designpattern.singletonpattern.java.SingletonPattern01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 利用序列化与反序列化破坏单例模式
 */

public class XuLieHuaDemo {


    public static void main(String[] args) {


        try {
            //创建输出流
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SingletonPattern01.obj"));

            //将单例对象写到文件中
            oos.writeObject(SingletonPattern01.getInstance());


            //从文件中读取单例对象
            File file = new File("SingletonPattern01.obj");

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            SingletonPattern01 s1 = (SingletonPattern01) ois.readObject();

            //判断是否是同一个对象
            System.out.println("序列化与反序列化破坏单例模式 : " + (s1 == SingletonPattern01.getInstance()));

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
