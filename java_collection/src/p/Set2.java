package p;




import java.util.Comparator;

import java.util.Set;
import java.util.TreeSet;

/**
 * Author:Fanleilei
 * Created:2019/6/14 0014
 */

class Person2 {

    private String name;
    private Integer age;

    public Person2(String name, Integer age) {
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
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
class AscAgeComparator implements Comparator<Person2>{//equals()方法，Object类已经帮助该类实现了


    //Person2的比较器
    //升序
    @Override

    public int compare(Person2 o1, Person2 o2) {
        return o1.getAge()-o2.getAge();//升序
    }

}
class DescAgeComparator implements Comparator<Person2>{//equals()方法，Object类已经帮助该类实现了


    //Person2的比较器
    //降序
    @Override

    public int compare(Person2 o1, Person2 o2) {
        return o2.getAge()-o1.getAge();//降序
    }

}
public class Set2 {

    public static void code1() {


        Set<String> set=new TreeSet<>();//有序存储，不能能存储null
        set.add("Hello");
        set.add("World");
        set.add("hello");
        //重复元素
        set.add("Hello");
        set.add(null);
        System.out.println(set);
    }

    public static void main(String[] args) {

        Set<Person2> set = new TreeSet<>(new AscAgeComparator());//传入一个Comparator接口
        set.add(new Person2("张三", 20));
        set.add(new Person2("李四", 14));

        System.out.println(set);

    }


}
