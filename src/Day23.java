import java.util.AbstractCollection;
import java.util.Scanner;

/**
 * Created by 邸子豪 on 2017/3/23.
 */
public class Day23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("消费金额");
        double a =input.nextDouble();
        if (a >= 100) {
            System.out.println("是否是会员");
            char x = input.next().charAt(0);
            if (x == '是') {
                System.out.println("打9折");
            } else {
                if (a >= 100 && a < 200) {
                    System.out.println(0.8*a);
                } else {
                    System.out.println("打7.5");
                    System.out.println(0.75*a);
                }
            }
        } else {
            System.out.println("不打折");
        }
        System.out.println("SS");

    }

}
