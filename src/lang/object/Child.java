package lang.object;

//Child 는 Parent 를 명시적으로 상속받음.
public class Child extends Parent {
    public void childMethod() {
        System.out.println("Child.childMethod 실행");
    }
}
