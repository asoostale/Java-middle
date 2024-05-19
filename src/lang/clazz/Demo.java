package lang.clazz;

public class Demo implements Inf2{


    public void method1() {
        System.out.println(a);
    }

    public void method2() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        Inf2 obj = new Demo();
        obj.method2();
        obj.method3();
    }

}
