package com;

import javafx.scene.effect.SepiaTone;

import java.util.*;

/**
 * Author:Fanleilei
 * Created:2019/3/8 0008
 */
public class TestSet {

    public static void code1() {

        //TreeSet无参构造方法，元素排序使用元素的排序策略
        //TreeSet有参数，传递比较器的实例化对象，采用自定义的排序方法
        System.out.println("TreeSet无参数：");
        Set<String> set1=new TreeSet<>();
        set1.add("Php");
        set1.add("Python");
        set1.add("java");
        set1.add("C");

        Iterator<String> iterator=set1.iterator();
        while (iterator.hasNext()){

            System.out.print(iterator.next()+"、");
        }
        System.out.println();
        System.out.println("TreeSet有参数：");

        Set<String> set2=new TreeSet<>(
                (o1,o2)->o1.compareTo(o2)*-1
        );
        set2.add("Php");
        set2.add("Python");
        set2.add("java");
        set2.add("C");

        Iterator<String> iterator2=set1.iterator();
        while (iterator2.hasNext()){

            System.out.print(iterator2.next()+"、");
        }

    }

    public static void main(String[] args) {
        Set<Person> set=new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        set.add(new Person("Jack",12));
        set.add(new Person("Alice",22));
        for(Person p:set){
            System.out.println(p);
        }
        System.out.println(set.contains(new Person("Jack",12)));//true

        Iterator<Person> iterator=set.iterator();
        while(iterator.hasNext()){
            Person p=iterator.next();
            if(p.getName().equals("Jack")){

                System.out.println(p);
                iterator.remove();

            }

        }
        System.out.println("-------");
        System.out.println(set);
    }

    public static void code2() {
        Vector<String> vector=new Vector<>();
        vector.add("Java");
        vector.add("C");
        vector.add("C++");
        vector.add("Go");
        Enumeration<String> enumeration=vector.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());

        }

    }


}


class Person{

    private  String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}