package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {

        /**
         * 모든 ENUM 반환
         */
        // 1. 무식한 방법
        Grade[] values = Grade.values();
        for (Grade value : values) {
            System.out.println("name = " + value.name() + ", ordinal(순서) = " + value.ordinal());

        }
        // 2. 올바른 방법
        String result = Arrays.toString(values);
        System.out.println("result = " + result);


        /**
         * String -> ENUM 변환
         */

        String test = "GOLD";
        Grade testResult = Grade.valueOf(test);


    }
}
