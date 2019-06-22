package map;

import java.util.*;

/**
 * Author:Fanleilei
 * Created:2019/6/22 0022
 */
public class MapTest3 {

    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"张三三");
        map.put(2,"hello");
        map.put(3,"world");
        //1.Map->Set
        Set<Map.Entry<Integer,String>> set=map.entrySet();

        //2.取得Set接口迭代器
        Iterator<Map.Entry<Integer,String>> iterator=set.iterator();
        //3.迭代输出
        while(iterator.hasNext()){
            Map.Entry<Integer,String> entry=iterator.next();
            System.out.println(entry.getKey()+"="+entry.getValue());

        }
    }
}
