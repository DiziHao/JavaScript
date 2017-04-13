package java1702.javase;

/**
 * Created by 邸子豪 on 2017/4/5.
 */
public abstract class Tset {
    private int i;

    public Tset(int i) {
        this.i = i;
    }

    public abstract void method(String s, boolean b);

    public abstract void method(String s);

    public static void main(String[] args) {
//        Tset tset = new Tset();
        SubTset subTset = new SubTset(1);
    }
}

class SubTset extends Tset{
    public SubTset(int i) {
        super(i);
    }

    @Override
    public void method(String s, boolean b) {

    }

    @Override
    public void method(String s) {

    }
}