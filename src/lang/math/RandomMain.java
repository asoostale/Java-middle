package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random();

        int randomInt = random.nextInt();
        random.nextInt(10); // 0 ~ 9까지 출력
        int rangeRandomInt = random.nextInt(-4,10); // 범위 지정 가능 -3~ 9까지
        System.out.println(rangeRandomInt);
        // 문제 1~10까지 출력
        int result  = random.nextInt(10) + 1;
        System.out.println("result = " + result);

        double randomDouble = random.nextDouble();// 0.0 ~ 1.0 사이의 실수값 출력
        boolean randomBoolean = random.nextBoolean();// true or false


        if (randomInt > 0) {
            System.out.println("양수입니다.");
        } else {
            System.out.println("음수입니다.");
        }


    }
}
