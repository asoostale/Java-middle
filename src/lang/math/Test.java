package lang.math;

public class Test {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        int int1 = Integer.parseInt(str1);
        int int2 = Integer.parseInt(str2);

        System.out.println(int1 + int2);
        System.out.println("=================");


        String[] array = {"1.5", "2.5", "3.0"};
        double sum = 0;
        for (String s : array) {
            double v = Double.parseDouble(s);
            sum += v;
        }

        System.out.println(sum);

        System.out.println("===============");

        String str = "100";

        int i = Integer.parseInt(str); // Integer.parseInt 하면 Int로 변환
        Integer i1 = Integer.valueOf(str); // Inter.valueOf 하면 Integer로 변환
        //오토언박싱
        String str3 = "200";
        Integer test = Integer.valueOf(str3);
        int tes2 = test;


        int i2 = i1.intValue(); // Integer를 int로 변환 ** 자주 쓰므로 암기하자
        System.out.println("i2 = " + i2);

        Integer i3 = Integer.valueOf(i2); // 다시 인트를 Integer로 변환

    }
}
