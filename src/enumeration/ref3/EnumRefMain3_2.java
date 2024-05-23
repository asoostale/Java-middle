package enumeration.ref3;

public class EnumRefMain3_2 {
    public static void main(String[] args) {
        int price = 10000;


        //더이상 DiscountService가 필요 없게 되었다.
        int discountBasic = Grade.BASIC.discount(price);
        System.out.println("discountBasic = " + discountBasic);


    }
}
