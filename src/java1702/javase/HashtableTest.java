package java1702.javase;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by 邸子豪 on 2017/4/10.
 */
public class HashtableTest {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();// K - key 键 V - value 值  K -> V
        hashtable.put(1, "a");
        hashtable.put(100, "hi");
        hashtable.put(2, "hello");
        hashtable.put(5, "test");
        hashtable.put(200,"wrold");
        hashtable.put(3,"null" );
//        hashtable.put(null, "test");
//        hasht able.remove(100);
//        hashtable.clear();
        System.out.println(hashtable.size());//有多少值
        System.out.println(hashtable.get(3));//求键位上的值
        for (Integer integer : hashtable.keySet()) {
            System.out.println(integer+"->"+hashtable.get(integer));
        }//可以取两种值
        for (String s : hashtable.values()) {
            System.out.println(s);
        }//求值
        System.out.println("-------");
        for (Map.Entry<Integer, String> integerStringEntry : hashtable.entrySet()) {
            System.out.println(integerStringEntry.getKey()+"->"+integerStringEntry.getValue());
        }
        /**
         *

        for (Integer integer : hashtable.keySet()) {
            System.out.println(integer + "->" + hashtable.get(integer));
            }

        for (String s : hashtable.values()) {
            System.out.println(s);
            }
        for (Map.Entry<Integer, String> integerStringEntry : hashtable.entrySet()) {
            System.out.println(integerStringEntry.getKey() + "->" + integerStringEntry.getValue());
        }*/
    }
}
