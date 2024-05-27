package nested.nested.local;

public class LocalOuterV1 {

    private int one = 3;

    public void process(int three) {
        int two = 1;


        class LocalPrinter {
            int four = 0;

            public void printData() {
                System.out.println(" one = " + one);
                System.out.println(" two = " + two);
                System.out.println(" three = " + three);
                System.out.println(" four = " + four);

            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        localOuterV1.process(3);
    }


}
