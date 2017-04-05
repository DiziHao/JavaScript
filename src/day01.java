import java.util.Scanner;

/**
 * Created by 邸子豪 on 2017/3/7.
 */
public class day01 {
    public static void main(String[] args){


            //数学
            int math;
            //c语言
            int c;
            //物理
            int phycal;
            //英语
            int english;
            Scanner input = new Scanner(System.in);
            System.out.println("请输入数学的成绩");
            math = input.nextInt();
            System.out.println("请输入c语言的成绩");
            c = input.nextInt();
            System.out.println("请输入物理的成绩");
            phycal = input.nextInt();

            System.out.println("请输入英语的成绩");
            english = input.nextInt();
            System.out.println(math + c + english);
            if (math > c)
                System.out.println("数学跟c语言较高得中成绩比数为分" + " 数学" + math);

            else;{
            System.out.println("数学跟c+语言中成绩比较高的分数为c语言" + c);
        }




    }

}

