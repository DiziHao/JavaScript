import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by 邸子豪 on 2017/3/22.
 */
public class Day22b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入消费金额");
        double money = input.nextDouble();
        System.out.println("1:满50元加,2元换购百事可乐饮料1瓶");
        System.out.println("2:满100元加,3元换购500ml可乐");
        System.out.println("3:满100元加,10元换购5公斤面粉");
        System.out.println("4:满200元加，10元可换购1个苏波儿炒菜锅");
        System.out.println("5:满200元加，20元可换购欧莱雅爽肤水一瓶");
        System.out.println("6:不换购");
        int a =input.nextInt();
        switch (a) {
            case 1:
                if (money >= 50) {
                    System.out.println("换购百事可乐饮料1瓶");
                    System.out.println(money+2);
                    System.out.println("谢谢");
                } else {
                    System.out.println("失败");
                    System.out.println(money);
                    System.out.println("谢谢");
                }
                break;
            case 2:
                if (money >= 100) {
                    System.out.println("换购500ml可乐");
                    System.out.println(money+3);
                } else {
                    System.out.println("失败");
                    System.out.println(money);
                    System.out.println("谢谢");
                }
                break;
            case 3:
                if (money >= 100) {
                    System.out.println("换购5公斤面粉");
                    System.out.println(money + 10);
                } else {
                    System.out.println("失败");
                    System.out.println(money);
                    System.out.println("谢谢");
                }
                break;
            case 4:
                if (money >= 200) {
                    System.out.println("换购1个苏波儿炒菜锅");
                    System.out.println(money + 10);
                } else {
                    System.out.println("失败");
                    System.out.println(money);
                    System.out.println("谢谢");
                }


            case 5:
                if (money >= 200) {
                    System.out.println("换购欧莱雅爽肤水一瓶");
                    System.out.println(money + 20);
                } else {
                    System.out.println("失败");
                    System.out.println(money);
                    System.out.println("谢谢");
                }
                break;
            case 6:
                System.out.println("不换购");
                System.out.println("谢谢");
        }
    }
}
