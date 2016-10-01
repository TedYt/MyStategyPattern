package com.tim.strategypattern;

/**
 * Created by Tim on 16/10/1.
 *
 *
 * 策略类,包含一个共有的算法方法,具体的实现
 * 有其实现者按照自己的策略去实现
 */
public interface MemberStrategy {
    double calePrice(double price);
}
