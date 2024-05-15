package lang.string.chainning;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int value = adder.add(1).add(2).add(3).getValue();
        System.out.println("value = " + value);


        System.out.println("");

        int num = 11;
        Integer i = Integer.valueOf(num); // 명시적 변환

        int num2 = 11;
        Integer result = num2; //자동변환
        int testNumber = result; // 다시 자동으로 역변환








    }
}
