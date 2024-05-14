package lang.string;

import lang.object.equals.UserV2;

public class StringBasicMain {

    public static void main(String[] args) {





        String str2 = new String("이헤리");
        String str1 = "이혜리";

        System.out.println(str2==str1);
        System.out.println(str2.equals(str1) );

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);


        String str3 = "hello";
        str3.toUpperCase();






    }
}
