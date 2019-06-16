package p;


import java.util.*;

/**
 * Author:Fanleilei
 * Created:2019/6/14 0014
 */

class Person3 {

    private String name;
    private Integer age;

    public Person3(String name, Integer age) {
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
    public boolean equals(Object obj) {

        if(obj==this){ //自反性
            return true;

        }else if(obj==null){//非空性
            return false;

        }else if(!(obj instanceof Person3)){//5个规则
            return false;
        }
        Person3 per=(Person3)obj;
        return per.age.equals(this.age)&&per.name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age,name);
    }

    @Override
    public String toString() {
        return "Person3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

public class HashSet2 {

    public static void main(String[] args) {


        Person3 p1=new Person3("张三",20);
        Person3 p2=new Person3("张三",20);
        System.out.println(p1.equals(p2));
        Set<Person3> set = new HashSet<>();
        set.add(new Person3("张三", 20));
        //Object类提供的hashCode方法默认使用对象的地址进行hash  针对HashSet和HashMap
        set.add(new Person3("李四", 14));
        set.add(new Person3("李四", 14));//在未覆写hashCode和equals方法时  或只覆写了equals而没覆写hashCode时，这两个对象不同
                                                    //若都覆写hashCode和equals方法，则认为这两个对象相等。
        System.out.println(set);



    }


}
