package enumeration.ex1;

import enumeration.ex0.DiscountService;

public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;


        int basic = enumeration.ex0.DiscountService.discount("BASIC", price);
        System.out.println("discountPrice = " + basic);

        int gold = enumeration.ex0.DiscountService.discount("GOLD", price);
        System.out.println("discountPrice = " + gold);

        int diamond = DiscountService.discount("DIAMOND", price);
        System.out.println("discountPrice = " + diamond);
    }
}
