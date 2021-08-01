package com.qwy.designpattern.lagou.observerdesignpattern.template;


public class Demo {

    public static void main(String[] args) {
        //创建一个观察者对象
        ConcreteSubject subject = new ConcreteSubject();
        //注册被观察者
        subject.registerObserver(new ConcreteObserverOne());
        subject.registerObserver(new ConcreteObserverTwo());
        subject.notifyObservers(new Message("First Message"));
    }
}
