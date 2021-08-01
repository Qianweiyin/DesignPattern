package com.qwy.designpattern.lagou.behavior.observerd.java;

public class ObserverImpl implements Observer {
    @Override
    public void notify(String act, double amt) {
        System.out.println("=== 接收到通知：账户：" + act + " 账单：" + amt);
    }
}
