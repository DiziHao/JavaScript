package java1702.javase;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 邸子豪 on 2017/4/12.
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"o");
        map.put(100,"asd");
        map.put(1000,"fsd");
        map.put(1000,"fsd");

        System.out.println(map.size());
        System.out.println(map.get(100));

        for (Integer integer : map.keySet()) {
            System.out.println(integer +">"+map.get(integer));
        }
//        for (String s : map.values()) {
//            System.out.println(s);
//        }
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey()+">"+entry.getValue());
//        }
    }
}
