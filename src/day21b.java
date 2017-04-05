import java.util.Scanner;

/**
 * Created by 邸子豪 on 2017/3/21.
 */
public class day21b {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数字a");
        int a = input.nextInt();
        System.out.println("请输入数字b");
        int b = input.nextInt();
        if (a%b==0||(a+b>1000)){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
}
