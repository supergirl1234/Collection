package m;



import java.util.Enumeration;
import java.util.Vector;

/**
 * Author:Fanleilei
 * Created:2019/6/16 0016
 */
public class VectorTest {

    public static void main(String[] args) {

        Vector<String> vector= new Vector<>();
        vector.add("hello");
        vector.add("world");
        vector.add("java");
        vector.add("hiihi");

        Enumeration<String> enumeration=vector.elements();//取得 Enumeration对象
        while(enumeration.hasMoreElements()){

            System.out.println(enumeration.nextElement());
        }

        System.out.println("*************");
        for(String item:vector){
            System.out.println(item);
        }

    }
}
