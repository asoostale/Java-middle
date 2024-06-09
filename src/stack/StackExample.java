package stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("접시 1");
        stack.push("접시 2");
        stack.push("접시 3");

        System.out.println(stack);

        String pop = stack.pop();
        System.out.println("pop = " + pop);
        System.out.println(stack);

        //결론 스택은 -> 맨 위의 데이터만 접근 가능하기에 중간에 있는 데이터에 접근할 수 없다.


    }
}
