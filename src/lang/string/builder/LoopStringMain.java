package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); //시스템에서 현재 밀리세컨드 시작 얻을 수 있음=
        String result = " ";
        for (int i = 0; i < 100000; i++) {
            result += "hello java";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("result = " + result);

        System.out.println("Time = " + (endTime - startTime) + "ms");
    }
}
