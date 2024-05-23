package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        //enum은 암시적으로 static final이 적용되기 때문에 저렇게 바로 클래스로 호출이 가능하다.

        // BASIC, GOLD ,DIAMOND는 Grade의 각각의 인스턴스이다.
        System.out.println(Grade.BASIC instanceof Grade);
        System.out.println(Grade.GOLD instanceof Grade);
        System.out.println(Grade.DIAMOND instanceof Grade);

        //참조값이 각각 다르다.
        System.out.println(refValue(Grade.BASIC));
        System.out.println(refValue(Grade.GOLD));
        System.out.println(refValue(Grade.DIAMOND));
    }


    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
