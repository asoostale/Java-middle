package lang.string.immutable;

public class StringImmutable1 {


    public static void main(String[] args) {
        String str = " 이혜리 왈 : 사랑해~";
        str.concat("수영 오빠");

        System.out.println(str);

        /**
         * 기대값
         * 이혜리 왈 : 사랑해~수영 오빠
         *
         * 하지만 String은 불변객체이기 때문에 한번 할당되면 바뀌지 않는다!
         */
    }



}
