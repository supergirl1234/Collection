package com;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Author:Fanleilei
 * Created:2019/6/14 0014
 */

class Person1 implements Comparable<Person1>{

private String name;
private Integer age;

public Person1(String name, Integer age) {
        this.name = name;
        this.age = age;
        }

public String getName() {
        return name;
        }

public void setName(String name) {
        this.name = name;
        }

public Integer getAge() {
        return age;
        }

public void setAge(Integer age) {
        this.age = age;
        }

@Override
public String toString() {
        return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
        }

//覆写equals方法，使其满足：如果同一个类的对象的属性值相等，则两个对象相同；如果是同一个对象，则两个对象也相同
@Override
public boolean equals(Object obj) {//
        if(obj==this){//是否是相同对象
        return true;

        }else if(obj==null){
        return false;

        }else if(!(obj instanceof Person)){//是否是同一个类的对象

        return false;
        }

        Person1 person=(Person1) obj;
        return this.age.equals(person.age)&&this.name.equals(person.name);//比较属性值
        }

    @Override
    public int compareTo(Person1 o) {//先比较年龄再比较名字
        if(this.age>o.age){
            return 1;

        }else if(this.age<o.age){
            return -1;

        }else{

            return this.name.compareTo(o.name);
        }
    }
}
public class Set1{

    public static void code1() {

        Set<String> set=new HashSet<>();//无序存储,能存储null
        //Set<String> set=new TreeSet<>();//有序存储，不能能存储null
        set.add("Hello");
        set.add("World");
        set.add("hello");
        //重复元素
        set.add("Hello");
        set.add(null);
        System.out.println(set);
    }

    public static void main(String[] args) {

        Set<Person1> set=new TreeSet<>();//自定义类要想保存到TreeSet中，要么实现Comparable接口，要么向Treeset传入比较器（Comparator接口）
        set.add(new Person1("张三",20));//TreeSet有序存储中的序指Comparable接口的序，对String类，序是按ASCII码的排列大小
        set.add(new Person1("李四",14));
        System.out.println(set);

    }


}
