/**
 * Created by 邸子豪 on 2017/3/28.
 */
public class day28a {
    public static void main(String[] args) {
        int[] array = new int[37];
        array[0] = 1;//第1个数
        array[1] = 1;//第2个数
        for (int num=2;num<37;num++) {
            //第三个数等于第一个数加上第二个数
            array[num] = array[num-1] + array[num-2];
        }
        System.out.println(array[36]);


        
    }
}
