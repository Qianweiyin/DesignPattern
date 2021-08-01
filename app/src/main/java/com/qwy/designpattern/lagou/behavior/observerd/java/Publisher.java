package com.qwy.designpattern.lagou.behavior.observerd.java;


public interface Publisher {

    void addObserver(Observer o);

    void removeObserver(Observer o);

    void notify(double amt);
}
