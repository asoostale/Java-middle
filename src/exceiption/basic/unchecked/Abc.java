package exceiption.basic.unchecked;

public class Abc {
    //클래스 변수
    public static String classVar = "I class var";
    //인스턴스 변수
    public String instanceVar = "I instance var";

    public static void classMethod() {
        System.out.println("classVar = " + classVar);
    }

    public void instanceMethod() {
        System.out.println(classVar);
        System.out.println(instanceVar);
    }
}

class StaticApp {
    public static void main(String[] args) {
        //클래스 변수 접근
        System.out.println(Abc.classVar);

        //인스턴스 변수 접근
        Abc abc = new Abc();
        System.out.println(abc.instanceVar);

    }
}


