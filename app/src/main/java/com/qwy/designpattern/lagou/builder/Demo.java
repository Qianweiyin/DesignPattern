package com.qwy.designpattern.lagou.builder;

public class Demo {
    public static void main(String[] args) {


        Director director = new Director();
//        构建器
        Builder builder = new ConcreteBuilder();
        director.construct(builder);
        System.out.println(builder.getResult());
    }
}
