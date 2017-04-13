package java1702.javase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 邸子豪 on 2017/4/10.
 */
public class Arraylist90 {
    public static void main(String[] args) {
        List<String>strings = new ArrayList<>();
        strings.add("name");
        strings.add("age");
        strings.add("gerden");
        for (String string : strings){
            System.out.println(string);
        }
    }
}
