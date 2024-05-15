package lang.string.chainning;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder.add(2);
        ValueAdder adder3 = adder.add(3);

        int result = adder3.getValue();
        System.out.println("result = " + result);


        System.out.println("result = " + adder1.getValue());
        System.out.println("result = " + adder2.getValue());
        System.out.println("result = " + adder3.getValue());

        System.out.println(adder1);
        System.out.println(adder2);
        System.out.println(adder3);
        /**
         * lang.string.chainning.ValueAdder@3f99bd52
         * lang.string.chainning.ValueAdder@3f99bd52
         * lang.string.chainning.ValueAdder@3f99bd52
         * 로서 다 똑같은 놈임. 즉 new ValueAdder(); 시점에 한놈으로 돌려 사용 중
         * this로 자기 자신 반환했음
         */
    }
}
