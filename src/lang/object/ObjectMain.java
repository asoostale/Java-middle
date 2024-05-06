package lang.object;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();


        // toString 메소드는 Object 클래스의 메소드
        String string = child.toString();
        System.out.println(string);

    /**
     * Object가 제공하는 기능(대표적)
     * toString()
     * equals()
     * getClass()
     * 등등
     */
    }
}
