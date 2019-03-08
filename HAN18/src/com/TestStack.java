package com;

import java.util.Stack;

/**
 * Author:Fanleilei
 * Created:2019/3/8 0008
 */
public class TestStack {

    public static void main(String[] args) {

        Stack<String> stack=new Stack<>();
        //入栈
        stack.push("Java");
        stack.push("C++");
        stack.push("我");
        System.out.println(stack.peek());//"我"  栈顶元素
        System.out.println(stack.isEmpty());//false
        System.out.println(stack.size());//3  栈的长度
        //出栈
        //栈是先进后出
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //如果栈中已经空了，再出栈，会报错
        while(!stack.isEmpty()){

            System.out.println(stack.pop());
        }

    }
}
