package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 userV1 = new UserV1("id-100");
        UserV1 userV2 = new UserV1("id-100");

        System.out.println("identity = " + (userV1 == userV2));
        System.out.println("equals = " + (userV1.equals(userV2)));
        /**     equals >> false 뜬다.
         *
         * Object가 제공하는 equals는 기본적으로 ==으로 비교해버림.(클릭해보면 this==obj)
         * 즉 userV1 == userV2가 됨.
         * 즉 equals() 메서드를 재정의 해야한다.
         */

        String a = "안녕";
        String b = "안녕";
        System.out.println(a.toString());
        System.out.println(b.toString());

        System.out.println(a == b);
        System.out.println(a.equals(b));

        int ab = 1;
        int bc = 1;






    }
}
