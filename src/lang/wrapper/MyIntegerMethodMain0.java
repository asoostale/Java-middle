package lang.wrapper;

public class MyIntegerMethodMain0 {

    public static void main(String[] args) {
        int value = 10;

        int i = compareTo(value, 5);
        System.out.println("result = " + i);
    }

    public static int compareTo(int value, int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {

            return 1;

        } else
            return 0;
    }
}
