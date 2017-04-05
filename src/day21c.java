import java.util.Scanner;

/**
 * Created by 邸子豪 on 2017/3/21.
 */
public class day21c {
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
//        System.out.println("请输入性别");
//        char sex = input.next().charAt(0);
//        System.out.println("请输入年龄");
//        int age = input.nextInt();
//        //判断
//        if (age>=7||(age>=5&&sex=='男')){
//            System.out.println("搬动桌子");
//        }else {
//            System.out.println("不可以搬桌子");
//        }

//        System.out.println("请输入坏鸡蛋的数量");
//        int badegg = input.nextInt();
//        if (badegg>=5){
//            System.out.println("退掉");
//        }else {
//            System.out.println("吃掉");
//        }
//        System.out.println("能否被3或5整除");
//        int a = input.nextInt();
//        if (a%5==0||(a%3==0)){
//            System.out.println("3或5能被整除");
//        }else {
//            System.out.println("3或5不能被整除");
//        }
//        System.out.println("请输入数字a");
//        int a = input.nextInt();
//        System.out.println("请输入数字b");
//        int b = input.nextInt();
//        if (a%b==0||(a+b>100)){
//            System.out.println(a);
//        }else {
//            System.out.println(b);
//        }

//        System.out.println("请输入成绩");
//        int a=input.nextInt();
//        if (a >= 90) {
//            System.out.println("优秀");
//        } else if (a >= 80) {
//            System.out.println("良好");
//        } else if (a >= 60) {
//            System.out.println("中等");
//        } else if (a < 60) {
//            System.out.println("差");
//        }


        System.out.println("请输入有多少存款");
        int a =input.nextInt();
        if (a >= 500) {
            System.out.println("买凯迪拉克");
        } else if (a >= 100) {
            System.out.println("买帕萨特");
        } else if (a >= 50) {
            System.out.println("买依兰特");
        } else if (a >= 10) {
            System.out.println("奥托");
        } else {
            System.out.println("捷安特");
        }

    }
}

