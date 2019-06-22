package sta;

import java.util.Stack;

/**
 * Author:Fanleilei
 * Created:2019/6/22 0022
 */
public class StackTest {

    public static void main(String[] args) {
        Stack stack=new Stack();

        stack.push("123");
        stack.push("hello");
        stack.push("965");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //System.out.println(stack.pop());//栈中已无元素，抛异常
    }
}
