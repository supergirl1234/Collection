package com;

import java.util.*;
import java.util.concurrent.Callable;

/**
 * Author:Fanleilei
 * Created:2019/3/9 0009
 */
public class TestCollection {

    public static void code1() {

        //线程不安全
        Map<String,String> map=new HashMap<>();
        map.put("1","Jvva");

        //线程安全
        Map<String,String> map1=Collections.synchronizedMap(new HashMap<>());
        System.out.println(map1.getClass().getName());


    }

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        for(int i=65;i<123;i++){
            list.add(String.valueOf((char)i));

        }
        System.out.println("原始数据："+list);

        //反转方法
        Collections.reverse(list);
        System.out.println("反转之后："+list);

        //查找
        System.out.println(list.get(0));
        System.out.println(list.size());

        //Collections.binarySearch
        //使用二叉搜索算法搜索指定对象的指定列表。
        // 该列表必须根据被按升序排列natural ordering元素（如由sort(List)方法）之前使该呼叫。
        // 如果没有排序，结果是未定义的。
        int index=Collections.binarySearch(list,"z");
        System.out.println("查看z的下标："+index);//-59
        System.out.println("查看A的下标："+Collections.binarySearch(list,"A"));//-1

        //乱序
        Collections.shuffle(list);
        System.out.println("乱序之后："+list);

        //1.非同步集合-》同步集合
        //2.集合-》不可修改
        Map<String,String> map=new HashMap<>();
        map.put("1","java");
        System.out.println(map);
        map=Collections.unmodifiableMap(map);
        System.out.println(map);
        //Collections.unmodifiableMap(map)之后，就不能修改map集合了，否则会报错
       /* map.put("2","C");
        System.out.println(map);
       */


        List<String> data = new ArrayList<>();
        data.add("A");
        data.add("B");
        System.out.println(Collections.binarySearch(data, "A"));//0
        System.out.println(Collections.binarySearch(data, "B"));//1
    }
}
