package com.tim.strategypattern;

/**
 * Created by Tim on 16/10/1.
 */
public class StrategyTest {

    public static void test(){

        AdvanceMemberStrategy ams = new AdvanceMemberStrategy();

        Price price = new Price(ams);

        double finalePrice = price.quote(300);

        System.out.println("最终的价格是: " + finalePrice);
    }
}
