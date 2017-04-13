package java1702.javase;

import java.util.TreeSet;

/**
 * Created by 邸子豪 on 2017/4/11.
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<>();
        strings.add("d");
        strings.add("c");
        strings.add("b");
        strings.add("a");

        System.out.println(strings.size());
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
