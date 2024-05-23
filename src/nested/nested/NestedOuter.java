package nested.nested;

public class NestedOuter {
    private static int outClassValue = 3; //스태틱 필드
    private int outInstanceValue = 2;

    static class Nested {
        private static int nestedInstanceValue = 1;

        public static void print() {
            // 자신의 멤버에 접근
            System.out.println("자신의 멤버에 접근, nestedInstanceValue = " + nestedInstanceValue);

            //바깥 클래스의 인스턴스 멤버에 접근할 수 없다.
            // System.out.println(outInstanceValue);

            //바깥 클래스의 클래스 멤버에는 접근할 수 있다. ** Private ** 도 가능하다.
            // Private라도 NestedOuter 안에 Nested가 있기 때문에
            System.out.println(NestedOuter.outClassValue);
            System.out.println(outClassValue);


        }
    }

}
