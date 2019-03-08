package com;

import java.util.Set;
import java.util.TreeSet;

/**
 * Author:Fanleilei
 * Created:2019/3/8 0008
 */
public class TestSet2 {

    public static void main(String[] args) {

        Set<person> set=new TreeSet<>();
        set.add(new person("Jack",12));
        set.add(new person("Tom",23));
        set.add(new person("Alice",22));


        System.out.println(set);
    }
}

class person implements  Comparable<person>{

    private  String name;
    private int age;


    public person(String name, int age) {
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

    @Override
    public int compareTo(person o) {
        if(this.age>o.age){
            return 1;

        }else if(this.age<o.age){
             return -1;

        }else{

            return this.name.compareTo(o.name) ;
        }

    }
}
