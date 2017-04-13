/**
 * Created by 邸子豪 on 2017/4/5.
 */
public class Exercise_four5 {
    public void method(int j,String i) {
        System.out.println("method...");
    }
    public int method(String s,int i) {
        System.out.println("20");
        return i;
    }

    public static void main(String[] args) {
        Exercise_four5 exercise_four5 = new Exercise_four5();
        exercise_four5.method("",0);
    }
}
