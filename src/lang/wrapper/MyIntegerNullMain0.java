package lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] values = {9, 2, 3, 1, 2 - 24, 24, 46, 23513, 223, -123, 23};
        System.out.println(findValue(values, 1));


        String str1 = new String("안녕");
        String str2 = new String("안녕");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String test2 = "10";
        Integer ii = Integer.valueOf(test2);// valueOf==>>레퍼형으로 반환
        //===================
        String test = "10";
        int i = Integer.parseInt(test); // parseInt ==>> 기본형으로 반환
    }

    private static int findValue(int[] value, int target) {
        for (int i : value) {
            if (i == target) {
                return i;
            }
        }
        return -1;
    }
}
