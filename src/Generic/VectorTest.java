package Generic;

import java.util.Vector;

/**
 * Created by 邸子豪 on 2017/4/13.
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();//兼容
        vector.add("test...");
        vector.add("123");
        vector.add("true");
        vector.add("456");

        String s = vector.get(2);//Type safe
        System.out.println(s);
    }
}
