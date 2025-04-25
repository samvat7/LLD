import Strategy.DiscountStrategy;

import Strategy.PercentageDiscountStrategy;

public class Main{

    // Strategy for Discounts
    public static void main(String[] args){

        DiscountStrategy d = new PercentageDiscountStrategy();

        d.getDiscount();
    }
}

