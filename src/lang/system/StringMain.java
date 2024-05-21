package lang.system;

import java.util.Arrays;

public class StringMain {
    public static void main(String[] args) {
        char[] arrayOrigin = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(arrayOrigin, 0, copiedArray, 0, arrayOrigin.length);

        System.out.println(copiedArray);

        String test = "hello";
        System.out.println(test.equals(copiedArray));

        System.out.println(copiedArray[0]);

        String result = Arrays.toString(copiedArray);
        System.out.println("result = " + result);
        System.out.println("=====================================================");
        char[] test1 = {'a', 's', 'o', 'o', 's', 't', 'a', 'l', 'e'};
        char[] test2 = new char[9];
        long nowTime = System.currentTimeMillis();
        for (int i = 0; i < test1.length; i++) {
            test2[i] = test1[i];
        }
        String result2 = Arrays.toString(test2);
        long lateTime = System.currentTimeMillis();
        long resultTime1 = lateTime - nowTime;

        char[] test3 = {'a', 's', 'o', 'o', 's', 't', 'a', 'l', 'e'};
        char[] test4 = new char[9];
        long nowTime2 = System.currentTimeMillis();
        System.arraycopy(test3, 0, test4, 0, test3.length);
        String result5 = Arrays.toString(test4);
        long lateTime2 = System.currentTimeMillis();
        long result3 = lateTime2 - nowTime2;

        if (resultTime1 > result3) {
            System.out.println("System.arrayCopy가 더 빠릅니다");
        }
        System.out.println("테스트가 의미 없습니다");


    }
}
