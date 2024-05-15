package lang.string.builder;

public class LoopStringBuilderMain {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("hello Java");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("result = " + sb);

        System.out.println("Time = " + (endTime - startTime) + "ms");


        /**
         * !!
         *  StringBuilder를 직접 사용하는 것이 더 좋은 경우!!
         *  반복문에서 반복해서 문자를 연결할 때
         *  !! 조건문을 통해 동적으로 문자열을 조합할 때 !!
         *      (쿼리문에서 상당히 유용하겠군)
         *      복잡한 문자열의 특정 부분을 변경할 때
         *      매우 긴 대용량 문자열을 다룰 때
         *
         */

        /**
         * 즉 LoopStringBuilderMain과 LoopStringMain의 차이점은
         * new로 매번 루프 속에서 StringBuilder를 생성하면 효율성 측면에서 엄청 안좋다.
         * StringBuilder를 루프 속에서 미리 만들어 놓고 루프 속에서는 객체의 메소드를 호출하는게
         * 최적화 측면에서 상당히 유리하다. 거의 700배 차이의 속다가 남.
         */
    }
}
