package enumeration.ref3;

import java.time.LocalDateTime;

public class EnumRefMain3 {
    public static void main(String[] args) {

        DiscountService discountService = new DiscountService();

        int basic = discountService.discount(Grade.BASIC, 10000);
        System.out.println("basic = " + basic);

        

    }
}
