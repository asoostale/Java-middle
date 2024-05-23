package enumeration.ex1;

import enumeration.ex0.DiscountService;

public class StringGradeEx1 {
    public static void main(String[] args) {
        int price = 10000;


        int basic = enumeration.ex0.DiscountService.discount(StringGrade.BASIC, price);
        System.out.println("discountPrice = " + basic);

        int gold = enumeration.ex0.DiscountService.discount(StringGrade.GOLD, price);
        System.out.println("discountPrice = " + gold);

        int diamond = DiscountService.discount(StringGrade.DIAMOND, price);
        System.out.println("discountPrice = " + diamond);
    }
}
