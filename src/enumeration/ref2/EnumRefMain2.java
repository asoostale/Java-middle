package enumeration.ref2;



public class EnumRefMain2 {
    public static void main(String[] args) {
        int price = 10000;


 DiscountService discountService = new DiscountService();
        System.out.println(discountService.discount(Grade.BASIC, 10000));
        System.out.println(discountService.discount(Grade.GOLD, 10000));
        System.out.println(discountService.discount(Grade.DIAMOND, 10000));





    }
}
