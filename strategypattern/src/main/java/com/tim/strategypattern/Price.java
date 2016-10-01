package com.tim.strategypattern;

/**
 * Created by Tim on 16/10/1.
 */
public class Price {

    //持有一个策略对象
    private MemberStrategy mStrategy;

    public Price(MemberStrategy mStrategy) {
        this.mStrategy = mStrategy;
    }

    public double quote(double price){
        return mStrategy.calePrice(price);
    }
}
