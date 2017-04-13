package java1702.javase;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by 邸子豪 on 2017/4/11.
 */
public class ArrayListLinkedList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String>linkedList = new LinkedList<>();

        long m1 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        for (int i = 0; i <1000000 ; i++) {
            arrayList.add(i + "");
            linkedList.add(i + "");
            arrayList.add(i + "");
            linkedList.add(i + "");
        }
        long m2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println(m2);

        long time1 = System.currentTimeMillis();
        System.out.println(arrayList.remove(1000000 - 1));
        long time2 = System.currentTimeMillis();
        System.out.println(linkedList.remove(1000000 - 1));
        long time3 = System.currentTimeMillis();
        System.out.println((m2 - m1) / 1024 / 1024);
        System.out.println("arrayList:"+(time2 - time1));//arrayList
        System.out.println("linkedList:"+(time3 - time2));//linkedList
//        long time1 = System.currentTimeMillis();
//        System.out.println(arrayList.remove(1000000-1));
//        long time2 = System.currentTimeMillis();
//        System.out.println(linkedList.remove(1000000-1));
//        long time3 = System.currentTimeMillis();
//
//        System.out.println("arrayList:"+(time2 - time1));//arrayList
//        System.out.println("linkedList:"+(time3 - time2));//linkedList
    }
}
