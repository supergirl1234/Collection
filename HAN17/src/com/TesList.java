package com;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Author:Fanleilei
 * Created:2019/3/5 0005
 */
public class TesList {
    //数据结构：List ->  ArrayList
    //1.ArrayList的数据是通过数组存放
    //2.ArrayList的默认构造方法实例化，存储数据的数组初始化时在第一次添加元素时进行(lazy load) -扩容-50% -默认容量10
    //3.ArrayLis的初始化容量的构造方法实例化，存储数据的数组立即初始化

    public static void code1() {

        //ArrayList->优先考虑使用
        List<String> list1=new ArrayList<>();
        list1.add("我");
        list1.add("是");
        list1.add("一");
        list1.add("个");
        list1.add("人");
        System.out.println(list1);
        System.out.println(list1.get(2));
        list1.set(3,"人");
        System.out.println(list1);
        System.out.println( list1.size());//5
        System.out.println(list1.contains("是"));//true
        System.out.println(list1.contains("你"));//false
        list1.remove("一");
        System.out.println(list1);
        System.out.println(list1.isEmpty());

        Object[] arr=list1.toArray();//
        for(Object p:arr){
            System.out.print(p+",");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));

        //迭代器
        Iterator<String> iterator=list1.iterator();
        while(iterator.hasNext()){

            System.out.println(iterator.next());
        }




    }

    public static void code2(){

        List<Person> list=new ArrayList<>();
        Person person1=new Person("张三",12);
        list.add(person1);
        list.add(new Person("李四",13));
        list.add(new Person("Jack",21));

        System.out.println(list);

        for(Person p:list){

            System.out.println(p);
        }

        // 集合类中contains()、remove()方法需要equals()支持

        //下面这个语句
        //未覆写equals方法时，false,这个new的对象和上面的person1不是一个对象
        //若覆写了equals方法，则该语句结果为true；
        System.out.println(list.contains(new Person("张三",12)));
        System.out.println(list.contains(person1));//true


        Person p1=new Person("jack",29);
        Person p2=new Person("jack",29);
        System.out.println(p1.equals(p2));//false,若覆写了equals方法，结果可能就不是false了，就可能是true
        System.out.println(p1==p2);//false
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());




    }


    //Vector
    public static void code3() {

        code2();
        List<String> vector=new Vector<>();
        vector.add("大学");
        vector.add("小学");
        vector.add("高中");
        vector.add("初中");
        System.out.println(vector);
        Iterator<String> iterator=vector.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }

        //Old API
        //Enumeration只有vector有此方法
       Enumeration<String> enumeration= ((Vector<String>) vector).elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());

        }

    }

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("父亲");
        list.add("母亲");
        list.add("儿子");
        list.add("女儿");
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){

            System.out.print(iterator.next()+"、");

        }
        System.out.println();

        ListIterator<String> listIterator=list.listIterator();
        System.out.println("从前往后读：");
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        //如果要想实现由后向前的输出，那么应该首先进行从前向后的输出，否则无法实现双向。
        System.out.println("从后往前读:");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());

        }

        System.out.println("------");
        while(listIterator.hasNext()){
           listIterator.add("+");
            System.out.print(listIterator.next());
        }
        System.out.println();
        for(String  p:list){

            System.out.print(p+"、");
        }


    }
}

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

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

   /* //手工写equals方法
    @Override
    public boolean equals(Object obj){
        if(obj==null){
            return false;

        }
        if(this==obj){
            return true;

        }
        if(obj instanceof Person){
            Person p=(Person) obj;
            return  this.getName().equals(p.getName())
                    &&this.getAge().equals(p.getAge());
        }
        return false;

    }*/

   //1.equals和hashCode方法覆写一定要一起使用
    //2.equals参与判断的属性都要参与hashCode的计算
   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }
}
