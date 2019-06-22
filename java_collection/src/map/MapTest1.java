package map;

import java.util.*;

/**
 * Author:Fanleilei
 * Created:2019/6/22 0022
 */
public class MapTest1 {

    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"hello");
        map.put(1,"Hello");//当key值重复，再次put，变为相应value的更新操作
        map.put(4,"Hello");
        map.put(2,"world");

        System.out.println(map.get(1));//Hello
        System.out.println(map.get(100));//null //key值不存在，返回null


        Set keyset= map.keySet();//取得所有的key值
        System.out.println(keyset);
        Iterator iterator=keyset.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

}
