import java.util.Scanner;

/**
 * Created by 邸子豪 on 2017/3/28.
 */
public class Day28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        double sum = 0;
//        for (int i = 1; i < 5; i++) {
//            System.out.println("请输入" + i + "位学员的成绩");
//            double a = input.nextDouble();
//            sum += a;
//            System.out.println("学员的平均" + sum / 4);
        for (int i=1  ;i<=9  ;i++ ) {
            for (int a=1  ;a<=i ;a++) {
                System.out.print(a+"*"+i+"="+i*a+"\t");
            }System.out.println();
        }

//            for (int y = 1; y <= 3; y++) {
//                double sum = 0;
//                System.out.println("请输入第" + y + "个班级");
//                for (int i = 1; i <= 4; i++) {
//                    System.out.print("请输入" + i + "位学员的成绩");
//                    double a = input.nextDouble();
//                    sum += a;
//                }System.out.println("学员的平均" + sum / 4);
//            }

        }
    }
