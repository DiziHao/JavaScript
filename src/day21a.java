import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by 邸子豪 on 2017/3/21.
 */
public class day21a{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入张浩的java成绩:");
        int score = input.nextInt();
        if (score > 90){
            System.out.println("老师说:不错，奖励一个MP4");
        } else if (score < 80) {
            System.out.println("老师说:罚抄代码");
        } else {
            System.out.println("没奖励没惩罚");
        }
    }
}
