package lang.string.immutable;

public class StringImmutable2 {


    public static void main(String[] args) {
        String str = " 이혜리 왈 : 사랑해 ~ ";
        String str2 = str.concat(" 수영 오빠");

        System.out.println(str2);


        /**
         * 그렇다면 왜 String은 JAVA에서 불변으로 설계 되었는가?
         * String은 풀(Pool)에 공유 되어서 사용되는데
         * 한놈이 저따구로 막 바껴버리면 그것을 공유하는 다른 객체들까지 사이드이펙트 현상이
         * 일어날 수 있다.
         * 그래서 자바 측에서 불변으로 설계 하였다.
         *
         */

    }



}
