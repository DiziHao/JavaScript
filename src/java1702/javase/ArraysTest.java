package java1702.javase;

import java.util.*;

/**
 * Created by 邸子豪 on 2017/4/12.
 */
public class ArraysTest {
    public static void main(String[] args) {
//        String[] strings = {"a","b","c","f","d"};
//        System.out.println(Arrays.toString(strings));
//        System.out.println(Arrays.binarySearch(strings,"c"));
//        String[]strings1 = Arrays.copyOf(strings,5);
//        System.out.println(Arrays.toString(strings1));
//        System.out.println(Arrays.toString(Arrays.copyOfRange(strings,1,3)));
//        Arrays.sort(strings);
//        System.out.println(Arrays.toString(strings));

        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("a");
        strings.add("1");
        strings.add("c");
        List<String>strings1 = new ArrayList<>();
        strings1.addAll(strings);//add加All全部
        System.out.println(strings1);
        Collections.reverse(strings1);//Collections收藏reverse相反的
        System.out.println(strings1);
//Collections集合
    }
}
