package map;

import java.util.*;

/**
 * Author:Fanleilei
 * Created:2019/6/22 0022
 */
public class MapTest2 {

    public static void main(String[] args) {
       // Map<Integer,String> map=new HashMap<>();
        Map<Integer,String> map=new Hashtable<>();//Hashtable中key和value不允许为空

        map.put(1,"hello");
        map.put(1,"Hello");
        map.put(4,"Hello");
        map.put(2,"world");

        map.put(null,null);
        map.put(null,null);
        map.put(3,null);


        System.out.println(map.get(1));
        System.out.println(map.get(100));


        Set<Integer> keyset= map.keySet();

        System.out.println(keyset);

        Iterator iterator=keyset.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

      for(Integer i:keyset){

          System.out.println(map.get(i));
      }
    }
}
