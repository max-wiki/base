package generic;

import java.util.Stack;

public class WorkWithAGeneric {
    public static void main(String[] args) {
        // Integer is  a type parameter
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        Integer pullOne = stack.pop();
        System.out.println(pullOne);
        Integer pullTwo = stack.pop();
        System.out.println(pullTwo);
    }
}
