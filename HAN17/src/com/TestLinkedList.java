package com;

import java.util.LinkedList;
import java.util.List;

/**
 * Author:Fanleilei
 * Created:2019/3/5 0005
 */
public class TestLinkedList {

    public static void main(String[] args) {

        List<String> list=new LinkedList<>();
        list.add("java");
        list.add("C++");
        list.add("Go");
        System.out.println(list);

        List<Integer> list1=new LinkedList<>();
        list1.add(12);
        list1.add(13);
        list1.add(14);
        for(Integer p:list1){
            System.out.print(p+" ");

        }
        System.out.println();

        ((LinkedList<String>) list).addFirst("hello");
        ((LinkedList<String>) list).addLast("end");
        System.out.println(list);

    }
}
