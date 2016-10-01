package com.tim.strategypattern;

/**
 * Created by Tim on 16/10/1.
 *
 *
 * 具体的策略类
 */
public class PrimaryMemberStrategy implements MemberStrategy {
    @Override
    public double calePrice(double price) {

        System.out.println("这是初级会员,么有折扣");
        return price;
    }
}
