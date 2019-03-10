package com;

import java.util.*;

/**
 * Author:Fanleilei
 * Created:2019/3/9 0009
 */
public class TestMap {

    public static void main(String[] args) {
        //HashMap
        Map<Integer,String> map=new HashMap<>();
        //插入数据put  key value
        map.put(1,"java");
        map.put(2,"C++");
        map.put(3,"我");
        map.put(4,"是");
        //key值重复，则覆盖
        map.put(1,"人");
        //value可以为null
        map.put(5,null);
        //key也可以为null
        map.put(null,"value");
        System.out.println(map);

        //获取数据 get
        System.out.println(map.get(1));//人
        System.out.println(map.get(2));//C++
        System.out.println(map.size());//6

        System.out.println("输出所有的key：");
        //获取map中的所有key  map.keySet
        Set<Integer> key=map.keySet();
        //输出所有的key
        for(Integer p:key){
            System.out.print(p+"、");
        }
        System.out.println();
        //或者用iterator
        Iterator<Integer> iterator=key.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+"、");

        }
        System.out.println();
        System.out.println("输出key=value:");
        //输出所有的key=value
        for(Integer p:key){
            System.out.print(p+"="+map.get(p)+",");

        }
        System.out.println();



        //输出所有的value
        System.out.println("输出所有的value:");
       Collection<String> value= map.values();
        System.out.println(value);


        //通过Entry遍历map
        System.out.println("通过Entry遍历map:");
        //将Map集合变成Set集合
        Set<Map.Entry<Integer,String>> set=map.entrySet();
        System.out.println("iterator循环：");
        Iterator<Map.Entry<Integer,String>> iterator1=set.iterator();
        while(iterator1.hasNext()){
            System.out.print(iterator1.next()+"、");

        }
        System.out.println();
        System.out.println("foreach循环：");
        for(Map.Entry<Integer,String> p:set){
            System.out.print(p+"、");

        }
    }
}
