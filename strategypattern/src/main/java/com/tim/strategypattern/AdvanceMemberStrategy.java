package com.tim.strategypattern;

/**
 * Created by Tim on 16/10/1.
 *
 *
 * 具体的策略类
 */
public class AdvanceMemberStrategy implements MemberStrategy {
    @Override
    public double calePrice(double price) {

        System.out.println("这是高级会员,有20%的折扣");
        return price * 0.2;
    }
}
