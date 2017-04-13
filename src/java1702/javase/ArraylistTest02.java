package java1702.javase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 邸子豪 on 2017/4/11.
 */
public class ArraylistTest02 {
    public static void main(String[] args) {
        List<String>strings1 = new ArrayList<>();
        strings1.add("a");
        strings1.add("b");
        List<String>strings2 = new ArrayList<>();
        strings2.add("a");
        strings2.add("b");
        strings2.add("c");
        System.out.println(strings1.equals(strings2));//输出strings1和strings2是否相同

        List<String> strings3 = strings2.subList(1,3);
        strings3 = new ArrayList<>(strings2.subList(1,3));//subList子类  【1,3】去除1是去除几个3是保留第三个
        System.out.println(strings3);

        System.out.println(strings3.containsAll(strings1));

        strings2.removeAll(strings3);//remove消除 All所有
        System.out.println(strings2);
        //retain 保留

        strings3.removeAll(strings2);
        strings3.removeAll(strings2);//[b,c][a]
        System.out.println(strings3);
    }
}
