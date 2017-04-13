package java1702.javase;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by 邸子豪 on 2017/4/12.
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        ArrayList<String>strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");
        ListIterator<String>listIterator = strings.listIterator();
        //next正常输出
        //prev反着输出
        //index索引
        //add添加元素
        //set修改元素
        //remove删除元素
        //sort排序
        //reverse异序
        while (listIterator.hasNext()) {
            String next =  listIterator.next();
            System.out.println(listIterator.next());

        }
    }
}
