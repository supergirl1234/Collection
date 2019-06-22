package m;

import java.util.*;

/**
 * Author:Fanleilei
 * Created:2019/6/16 0016
 */
public class Test {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        Collections.addAll(list,"A","B","C","D","E","F");//modeCount=6;
        Iterator<String> iterator=list.iterator();//1.取得集合迭代器（取得当前集合的副本）
                                                  //2.expectedModeCount=6
        while(iterator.hasNext()){
            //4.调用checkForComodification检查副本中的expectedModeCount是否等于集合中的modeCount，若不相等就报错
            String str=iterator.next();
            if(str.equals("B")){

                //list.remove(str);//使用集合类的remove方法，报错       //3.如果用该语句，使用集合类提供的remove（），modeCount=7；
                iterator.remove();//使用iterator的remove方法，不会出现错误
                continue;
            }

        }
        System.out.println(list);
    }
}
