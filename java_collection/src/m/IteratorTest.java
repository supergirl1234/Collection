package m;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Author:Fanleilei
 * Created:2019/6/16 0016
 */




public class IteratorTest {

    public static void main(String[]args) {

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("hiihi");

        //取得迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }
        System.out.println("**********");

        //取得迭代器
        ListIterator<String> iterator2 = list.listIterator();
        while (iterator2.hasNext()) {

            System.out.println(iterator2.next());
        }
        System.out.println("**********");

        while (iterator2.hasPrevious()) {

            System.out.println(iterator2.previous());
        }



    }
}
