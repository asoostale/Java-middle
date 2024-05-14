package lang.string;

public class CharArrayMain {
    public static void main(String[] args) {
        char a = '동';
        char b = '해';
        char c = '물';
        char d = '과';
        char e = '백';
        char f = '두';
        char g = '산';

        char n = '수';
        char m = '영';

        char[] arrays = new char[]{'동', '해', '물', '과', ' ', '백', '두', '산'};
        System.out.println(arrays);
        System.out.println(a);

        System.out.println(n + m);
        System.out.println(a + b + c + d + e + f + g);

        char exam1 = '동';
        char exam2 = '동';
        String exam3 = "동";
        String exam4 = "동";
        System.out.println(exam1 == exam2);

        System.out.println(exam1);


    }


}
