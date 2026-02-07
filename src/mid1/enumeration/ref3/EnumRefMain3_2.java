package mid1.enumeration.ref3;

import static mid1.enumeration.ref3.Grade.*;

public class EnumRefMain3_2 {

    public static void main(String[] args) {
        int price = 10_000;

        System.out.println("BASIC 할인 금액 : " + BASIC.discount(price));
        System.out.println("GOLD 할인 금액 : " + GOLD.discount(price));
        System.out.println("DIAMOND 할인 금액 : " + DIAMOND.discount(price));
    }
}
