import java.util.Scanner;
import java.util.concurrent.Callable;

/**
 * Created by 邸子豪 on 2017/3/23.
 */
public class Day23a {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;
        while (num <= 100) {
            sum += num;
            num =num+2;
        }
        System.out.println(sum);
//    }
//
//}
//

//        System.out.println("商品销售系统：");
//        char flag = 'y';
//        Scanner input = new Scanner(System.in);
//        while (flag == 'y') {
//            System.out.println("请输入商品编号1篮球2足球3T恤衫");
//            int num= input.nextInt();
//            switch (num) {
//                case 1:
//                    System.out.println("篮球的价格是50元");
//                    break;
//                case 2:
//                    System.out.println("足球的价格是100元");
//                    break;
//                case 3:
//                    System.out.println("T恤衫的价格是75元");
//                    break;
//                default:
//                    System.out.println("请输入正确编码");
//            }
//
//        System.out.println( "是否继续购买");
//        flag = input.next().charAt(0);
//    }
//        System.out.println("让你乱输滚吧");

//        System.out.println("************************* \n"+"请选择购买的商品编号: \n"
//                +"1.T恤 2.网球鞋 3.网球拍\n"+"*************************");
//        Scanner cs = new Scanner(System.in);
//        char flag = 'y';
//        double sum = 0;
//        while (flag == 'y') {
//            System.out.println("请输入商品编号:");
//            int a = cs.nextInt();
//            System.out.println("请输入购买数量:");
//            int num=cs.nextInt();
//            switch (a) {
//                case 1:
//                    sum+=num*245.0;
//                    System.out.println("T恤245.0"+num+"合计:"+num*245.0);
//                    break;
//                case 2:
//                    sum+=num*570.0;
//                    System.out.println("网球鞋570"+num+"合计:"+num*245.0);
//                    break;
//                case 3:
//                    sum+=num*1000.0;
//                    System.out.println("网球拍1000"+num+"合计:"+num*1000.0);
//                    break;
//            }
//            System.out.println("是否继续（y/n）");
//            flag = cs.next().charAt(0);
//            if (flag == 'n') {
//                System.out.println("折扣0.8\n"+"应付金额:"+(0.8*sum));
//                System.out.print("实付金额:");
//                int c = cs.nextInt();
//                System.out.print("找钱"+(c-0.8*sum));
//            }
//        }

    }

}

