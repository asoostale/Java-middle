package time;

import java.time.LocalDate;
import java.util.Arrays;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);

        LocalDate localDate = LocalDate.of(1990, 8, 10);
        System.out.println("지정 날짜 = " + localDate);

        String string = localDate.toString();
        System.out.println("string = " + string);

        //계산 (불변)
        LocalDate localDateDay = localDate.plusDays(10);
        LocalDate localDateMonth = localDate.plusMonths(5); //12월을 넘어가면 년도가 올라가게 됨
        System.out.println("localDateDay = " + localDateDay);
        System.out.println("localDateMonth = " + localDateMonth);



    }
}
