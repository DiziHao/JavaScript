import java.util.Scanner;

/**
 * Created by 邸子豪 on 2017/3/22.
 */
public class math {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("考试成绩");
        int a =input.nextInt();
        if (a >= 90) {
            System.out.println("A");
        } else if (a < 90 && a > 60) {
            System.out.println("B");
        } else if (a < 60) {
            System.out.println("C");
        }
    }
}
