package lang.clazz;

interface Inf2 extends Inf1{

    int a = 20;

    void method2();

    default void method3() {
        System.out.println(a + Inf1.a);
    }
}
