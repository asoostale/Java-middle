package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("==비교  " + str1 == str2);
        System.out.println("equals 비교 = " + str1.equals(str2));

        System.out.println("=====================================");
        String str4 = "hello";
        String str5 = "hello";
        System.out.println("str4 == str5 --->>" + str4 == str5);
        System.out.println("str4.equals(str5) -->> " + str4.equals(str5));

    }
}
