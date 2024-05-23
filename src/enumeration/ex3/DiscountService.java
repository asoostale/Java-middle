package enumeration.ex3;


import java.time.LocalDateTime;

public class DiscountService {

     static int discount(Grade classGrade, int price) {
        int discountPercent = 0;

        if (classGrade == Grade.BASIC) {
            discountPercent = 10;
        } else if (classGrade == Grade.GOLD) {
            discountPercent = 20;
        } else if (classGrade == Grade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println( classGrade + ": 할인 X");
        }

        return price * discountPercent / 100;


    }
}
