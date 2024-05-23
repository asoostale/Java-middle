package enumeration.ex2;

public class ClassGradeEx2_1 {
    public static void main(String[] args) {
        int price = 23123123;
        int discount = DiscountService.discount(ClassGrade.BASIC, price);
        int discount2 = DiscountService.discount(ClassGrade.GOLD, price);
        int discount3 = DiscountService.discount(ClassGrade.DIAMOND, price);

        System.out.println(discount);
        System.out.println(discount2);
        System.out.println(discount3);

    }
}
