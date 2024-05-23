package enumeration.ex0;

public class StringGradeEx0_1 {
    public static void main(String[] args) {
        int price = 10000;


        int basic = DiscountService.discount("BASIC", price);
        System.out.println("discountPrice = " + basic);

        int gold = DiscountService.discount("GOLD", price);
        System.out.println("discountPrice = " + gold);

        int diamond = DiscountService.discount("DIAMOND", price);
        System.out.println("discountPrice = " + diamond);
    }
}
