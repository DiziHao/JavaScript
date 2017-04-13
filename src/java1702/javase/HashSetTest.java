package java1702.javase;

import java.util.HashSet;

/**
 * Created by 邸子豪 on 2017/4/11.
 */
public class HashSetTest {//set不能重复
    public static void main(String[] args) {
        HashSet<String> string = new HashSet<>();
        string.add("hi");
        string.add("hello");
        string.add("test");
        string.add("test");

        System.out.println(string.size());
        for (String s : string) {
            System.out.println(s);
        }
    }
}
