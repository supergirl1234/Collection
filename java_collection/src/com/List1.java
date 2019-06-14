package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Author:Fanleilei
 * Created:2019/6/14 0014
 */

class Person{

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
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

        Person person=(Person) obj;
        return this.age.equals(person.age)&&this.name.equals(person.name);//比较属性值
    }
}
public class List1 {

    public static void code1(){

        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(9);
        System.out.println(list);
        System.out.println(list.contains(3));
        System.out.println(list.size());
        System.out.println(list.remove(3));//返回删除之前的元素
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.set(2,7));//返回修改之前的数据
        System.out.println(list);


    }

    public static void code2(String[] args) {

        //保存自定义的Person对象
        List<Person> list=new ArrayList<>();
        list.add(new Person("张三",12));
        list.add(new Person("李四",13));
        list.add(new Person("王五",14));

        System.out.println(list);
        System.out.println(list.contains(new Person("张三",12)));//在没有覆写equals时，结果为false
        System.out.println(list.remove(new Person("李四",13)));//在没有覆写equals时，结果为false
        System.out.println(list.size());

        //包装类和String类都覆写了equals方法


    }

    public static void main(String[] args) {

        List<Integer> list=new Vector<>();
        //List<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(9);
        System.out.println(list);
        System.out.println(list.contains(3));
        System.out.println(list.size());
        System.out.println(list.remove(3));//返回删除之前的元素
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.set(2,7));//返回修改之前的数据
        System.out.println(list);
    }
}
