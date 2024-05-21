package lang.system;

import java.util.Arrays;

public class StringMain {
    public static void main(String[] args) {
        char[] arrayOrigin = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(arrayOrigin, 0,copiedArray, 0, arrayOrigin.length);

        System.out.println(copiedArray);

        String test = "hello";
        System.out.println(test.equals(copiedArray));

        System.out.println(copiedArray[0]);

        String result = Arrays.toString(copiedArray);
        System.out.println("result = " + result);

    }
}
