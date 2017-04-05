import java.util.Arrays;

/**
 * Created by 邸子豪 on 2017/3/30.
 */
public class Day30 {
    public static void main(String[] args) {
        int a [] = {91,21,19,18,2};
        for (int i=0;i<a.length-1;i++) {
            for (int j=0;j<a.length-1-i;j++) {
                int temp = 0;//临时变量
                if (a[j]>a[j+1]);
                temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
