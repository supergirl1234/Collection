package com;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author:Fanleilei
 * Created:2019/3/8 0008
 */
public class TestQueue {

    public static void main(String[] args) {

        Queue<String> queque=new LinkedList<>();
        System.out.println(queque.isEmpty());
        //入列
       queque.add("Java");
       queque.add("我");
       queque.add("Go");
        System.out.println(queque.isEmpty());
        System.out.println(queque.peek());//队列的首元素为java
        System.out.println(queque.size());
        System.out.println("-------------");

        //出队列
        //队列是先进先出，栈是先进后出
        System.out.println(queque.poll());
        System.out.println(queque.poll());
        System.out.println(queque.poll());
        System.out.println(queque.poll());//null，但在栈Stack中，若栈中没有元素了，再pop就会出错

    }
}
