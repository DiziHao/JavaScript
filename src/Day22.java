import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.omg.PortableInterceptor.INACTIVE;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

/**
 * Created by 邸子豪 on 2017/3/22.
 */
public class Day22 {
public static void main(String[]args){
        Scanner input = new Scanner(System.in);
//        System.out.println("压岁钱如何花费");
//        int a = input.nextInt();
//        if (a > 1000) {
//            System.out.println("捐助失学儿童");
//        }else if (a <= 1000 && a > 500) {
//            System.out.println("买航模");
//        } else {
//            System.out.println("买意林");
//        }
//    System.out.println("如何花费压岁钱");
//    int a = input.nextInt();
//    if (a > 1000) {
//        System.out.println("捐助失学儿童");
//    } else if (a < 1000&&a>500) {
//        System.out.println("买航模");
//    } else if (a < 500) {
//        System.out.println("买百科全书");
//    }
    System.out.println("考试成绩");
    int a =input.nextInt();
    if (a >= 90) {
        System.out.println("给他买车");
    } else if (a >= 80) {
        System.out.println("给他买笔记本");   
    } else if (a >= 60) {
        System.out.println("给他买手机");
    } else if (a < 60) {
        System.out.println("没礼物");
    }
}
}
