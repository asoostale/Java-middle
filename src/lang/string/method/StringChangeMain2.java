package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWithSpaces = "    Java Programming      ";
        System.out.println("소문자로 변환 : " + strWithSpaces.toLowerCase());
        System.out.println("소문자로 변환 : " + strWithSpaces.toUpperCase());

        System.out.println("trim = " + strWithSpaces.strip());
        System.out.println("앞 공백 제 = " + strWithSpaces.stripLeading());
        System.out.println("뒤 공백 제 = " + strWithSpaces.stripTrailing());


    }
}
