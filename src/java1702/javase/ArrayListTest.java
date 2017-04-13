package java1702.javase;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by 邸子豪 on 2017/4/10.
 */
public class ArrayListTest<E> extends ArrayList<E> {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        List<String> strings = new ArrayList<>();
        strings.add("hi");
        strings.add("hello");
        strings.add("tset1");
        strings.add("tset2");

        strings.addAll(0, strings);
        //strings.clear();
        strings.remove(0);
        System.out.println(strings.size());
        System.out.println(strings.get(0));
        System.out.println("--------");
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println(strings.contains("test1"));
        System.out.println(strings.containsAll(strings));
        System.out.println(strings.indexOf("test1"));
        System.out.println(strings.isEmpty());
        System.out.println(strings.lastIndexOf("test1"));

        ArrayListTest<Integer> integers = new ArrayListTest<>();
        integers.add(1);
        final boolean add = integers.add(2);
        integers.add(3);

        integers.removeRange(1,2);
        System.out.println(integers.set(1,4));//3
        System.out.println(integers);//[1,4]

        for (Object o:integers.toArray()){
            System.out.println(o);
        }

        System.out.println(integers.size());//2

        ///capacity
        Field field = ArrayList.class.getDeclaredField("elementData");//reflect vi.\反射。映射：深思
        field.setAccessible(true);
        System.out.println("capacity1:"+((Objects[])field.get(integers)).length);


        integers.trimToSize();//capacity = size
        System.out.println("capacity2:" + ((Objects[]) field.get(integers)).length);
        System.out.println(integers.size());//2

    }
}
