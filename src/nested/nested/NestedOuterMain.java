package nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter.Nested nested = new NestedOuter.Nested();
            NestedOuter.Nested.print();

        nested.print();


        System.out.println("nestedClass = " + nested.getClass()); //$로 구분

    }
}
