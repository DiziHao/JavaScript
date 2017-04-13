package java1702.javase;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by 邸子豪 on 2017/4/12.
 * 无序没有顺序
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"a");
        map.put(-1,"bcd");
        map.put(100,"e");
        System.out.println(map.size());
        System.out.println(map.get(-1));
        for (Integer integer : map.keySet()) {
            System.out.println(integer +">" +map.get(integer));
        }
        for (String s : map.values()) {
            System.out.println(s);
        }//输出所有值
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println();
        }
    }
}
