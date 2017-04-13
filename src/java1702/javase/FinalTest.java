package java1702.javase;

/**
 * Created by 邸子豪 on 2017/4/6.
 */
public final class FinalTest {//终态类

    private final int i;

    public FinalTest(int i) {
        this.i = i;
    }
    public FinalTest() {
        i = 1;
    }
    public final void m() {
//        i = 1;
    }
    public static void main(String[] args) {
        FinalTest finalTest = new FinalTest(1);
    }
}
