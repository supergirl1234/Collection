package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Author:Fanleilei
 * Created:2019/3/5 0005
 */
public class TestSet {
    //HashSet
    public static void code1() {
        Set<String> set=new HashSet<>();
        /*set.add("我");
        set.add("是");
        set.add("一");
        set.add("个");
        set.add("人");*/
        set.add("Java");
        set.add("C++");
        set.add("C");
        set.add("PHP");
        set.add("Python");
        //set中不允许出现重复数据
        //set.add("人");
        System.out.println(set);//是无序的

        Iterator<String> iterator=set.iterator();
        while(iterator.hasNext()){

            System.out.print(iterator.next());//排列无序，按添加进去的顺序输出
        }
        System.out.println();
        //判断元素是否存在
        System.out.println(set.contains("我"));//true
        System.out.println(set.contains("学"));//false
    }

    public static void main(String[] args) {
code1();
        Set<String> set=new TreeSet<>();
       /* set.add("我");
        set.add("是");
        set.add("一");
        set.add("个");
        set.add("学");
        set.add("生");*/
        set.add("Java");
        set.add("C++");
        set.add("C");
        set.add("PHP");
        set.add("Python");

        System.out.println(set);//按升序的顺序排列的
    }
}
