package m;

import java.util.*;

/**
 * Author:Fanleilei
 * Created:2019/6/16 0016
 */
public class Test {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        Collections.addAll(list,"A","B","C","D","E","F");
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            String str=iterator.next();
            if(str.equals("B")){

                //list.remove(str);//使用集合类的remove方法，报错
                iterator.remove();//使用iterator的remove方法，不会出现错误
                continue;
            }

        }
        System.out.println(list);
    }
}
