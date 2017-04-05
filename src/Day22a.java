import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.omg.CORBA.SetOverrideType;

import javax.xml.ws.Service;
import java.util.Scanner;

/**
 * Created by 邸子豪 on 2017/3/22.
 */
//韩嫣参加计算机编程大赛
//        如果获得第一名，将参加麻省理工大学组织的1个月夏令营
//        如果获得第二名，将奖励惠普笔记本电脑一部
//        如果获得第三名，将奖励移动硬盘一个
//        否则，不给任何奖励

public class Day22a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("请输入名次");
//        int a = input.nextInt();
//        switch (a) {
//            case 1:
//                System.out.println("参加麻生理工大学组织的1个月夏令营");
//                break;
//            case 2:
//                System.out.println("奖励惠普笔记本一部");
//                break;
//            case 3:
//                System.out.println("奖励移动硬盘一个");
//                break;
//            default:
//                System.out.println("没有任何奖励");
//        }
        System.out.println("请输入");
        int a =input.nextInt();
        switch (a) {
            case 1:
                System.out.println("拨爸爸的号");
                break;
            case 2:
                System.out.println("拨妈妈的号");
                break;
            case 3:
                System.out.println("拨爷爷的号");
                break;
            case 4:
                System.out.println("拨奶奶的号");
                break;
            default:
                System.out.println("没有");
        }
    }
}
