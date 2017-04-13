package java1702.javase;

import java.util.Vector;

/**
 * Created by 邸子豪 on 2017/4/8.
 */
public class VectorTest {
    public static void main(String[] args) {
        //vector 向量 矢量
        Vector<String> strings = new Vector<>(100000,1000);//E element元素

        for (int i = 0; i <100 ; i++) {
            strings.add("hello");
        }
        strings.clear();//clear
        strings.add("hi");
        strings.add("aa");
        System.out.println(strings.size());//size大小
        System.out.println(strings.get(1));//get第几个序号
        System.out.println(strings.capacity());//capacity 容量
        //100k
    }
}
