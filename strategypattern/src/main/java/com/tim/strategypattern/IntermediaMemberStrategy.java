package com.tim.strategypattern;

/**
 * Created by Tim on 16/10/1.
 *
 *
 * 具体是策略类
 */
public class IntermediaMemberStrategy implements MemberStrategy {
    @Override
    public double calePrice(double price) {

        System.out.println("这是中级会员,有 10%的折扣");
        return price * 0.9;
    }
}
