package com;

import java.util.*;

/**
 * Author:Fanleilei
 * Created:2019/3/9 0009
 */
public class TestMap2 {

    //Hashtable
    public static void code1() {

        Map<Integer,String> map=new Hashtable<>();
        map.put(1,"世界");
        map.put(2,"完美");
        map.put(3,"动物园");
        map.put(0,"猴子");
        System.out.println(map);//默认降序排序
        //Hashtable的key不能为null
        //map.put(null,"我");//NullPointerException报错
        //Hashtable的value不能为null
        //map.put(5,null);//NullPointerException 报错
        System.out.println(map);
    }

    //TreeMap
    public static void main(String[] args) {
        Map<Integer,String> map=new TreeMap<>();
        map.put(1,"世界");
        map.put(2,"完美");
        map.put(3,"动物园");
        map.put(0,"猴子");
        //map.put(null,"我");//NullPointerException报错
        map.put(5,null);//OK
        System.out.println(map);//默认升序排列



        //1.如果key是系统（JDK,第三方）定义的类排序规则有可能已经定义完成，如果要修改，可以通过TreeMap的构造方法传入比较器(Comparator)接口的实现类对象（lambda表达式）

        //2.如果key是自定义的类，可以实现比较接口Comparable，也可以不去实现再使用的时候指定比较器(Comparator)接口的实现类对象
        //3.采用使用时指定Comparator方式比较灵活

        Map<Integer,String> map1=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2)*-1;//*-1是降序，没有*-1是升序
            }
        });
        map1.put(1,"我");
        map1.put(2,"是");
        map1.put(4,"student");
        map1.put(3,"for");
        System.out.println(map1);

        Set<Map.Entry<Integer,String>> set=map1.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator=set.iterator();
        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }


    }
}
