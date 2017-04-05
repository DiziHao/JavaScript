import java.util.Scanner;

/**
 * Created by 邸子豪 on 2017/3/27.
 */
public class Day27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int sum=0;
//        for (int i=0;i<5;i++){
//            System.out.println("请输入第"+(i+1)+"门课的成绩:");
//            Scanner sc = new Scanner(System.in);
//            double s = sc.nextDouble();
//            sum+=s;
//        }
//        System.out.println("平均数:"+(sum/5));
//        for (int n = 0, m = 6; n < 6; n+=2, m-=2){
//            System.out.println(n+"+"+m+"="+"6");
//        }
//         double sum=0;
//         double num=0;
//        for (int i=1;i <= 10;i++) {
//            System.out.println("请输入第"+i+"位顾客的年龄:");
//            int cs=input.nextInt();
//            if (cs <= 30) {
//                sum++;
//            } else if (cs > 30) {
//                num++;
//            }
//        }
//        System.out.println("30岁以上的比例是:"+sum/10*100+"%"+
//                "\n30岁以下的比例是:"+num/10*100+"%");
//        int sum = 0;
//        for (int i = 1; 1 < 10; i++) {
//            continue;

//        }
//        输出　100 -- 999之间, 所有个位为7的数
//        for (int i=7;i<=999;i+=10) {
//            System.out.println(i);
//        }
//        输出  100 -- 999之间, 所有百位 + 十位 == 个位　的数356
//        for (int i=100;i<=999;i++) {
//            int x=i/100;
//            int y=(i-x*100)/10;
//            int z=i%10;
//            if (z == x + y) {
//                System.out.println(i);
//            }
//        }
////        输出 10 - 99 之间所有“相邻”的值,如: 23, 54, 98
//        for (int i=10;i<99;i++) {
//            int x=i/10;
//            int y=i%10;
//            if (x - y == 1 | y - x == 1) {
//                System.out.println(i);
//            }
//
//        }


        for (int x=0;x<5;x++) {
            for (int y=0;y<x;y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int s=0;s<4;s++) {
            for (int z=0;z<s;z++) {
                System.out.print("*");
            }
        }

        System.out.println();


        }
    }
