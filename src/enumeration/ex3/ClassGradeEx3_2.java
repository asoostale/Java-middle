package enumeration.ex3;


import static enumeration.ex3.Grade.*;

public class ClassGradeEx3_2 {
    public static void main(String[] args) {
        int price = 10000;



        /**
         Grade grade = new Grade(); // enum은 생성 불가(private 생성자 암시적 사용)
         */
        int result1 = DiscountService.discount(BASIC, price);
        int result2 = DiscountService.discount(GOLD, price);
        int result3 = DiscountService.discount(DIAMOND, price);

        System.out.println("result = " + result1);
        System.out.println("result = " + result2);
        System.out.println("result = " + result3);

    }
}
