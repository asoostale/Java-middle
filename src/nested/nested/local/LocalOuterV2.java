package nested.nested.local;

public class LocalOuterV2 {

    private int one = 3;

    public void process(int three) {
        int two = 1;


        class LocalPrinter implements Printer{
            int four = 0;

            @Override
            public void printer() {
                System.out.println(" one = " + one);
                System.out.println(" two = " + two);
                System.out.println(" three = " + three);
                System.out.println(" four = " + four);
            }


        }

        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.printer();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuterV1 = new LocalOuterV2();
        localOuterV1.process(3);
    }


}
