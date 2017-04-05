import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

/**
 * Created by 邸子豪 on 2017/3/29.
 */
public class Day29 {
//    public static void main(String[] args) {
//        int [][] a = new  int[3][];
//
//        a[0] = new int[4];
//        a[1] = new int[3];
//        a[2] = new int[1];
//        int num=0;
//        for (int i=0;i<3;i++) {
//            for (int j=0;j<a[i].length;j++) {
//                a[i][j] = num;
//                num++;
//            }
//            System.out.println(Arrays.toString(a[i]));
//        }


//    }
//    int color;//颜色
//    double cost;//价格
//    double  speed;//速度
//
//    public static void main(String[] args) {
//        System.out.println("在跑");
    //name
//    String name;
//    //age
//    int age;
//    //grade年级
//    int grade;
//    //hobby爱好
//    String hobby;
//
//    public void show() {
//        System.out.println("名字:"+name+"\n"+"年龄:"+age+"\n"+"年级:"+grade+"\n"+"爱好:"+hobby);
//    }
//    public static void main(String[] args) {
//        Day29 zhanghao = new Day29();//创建学生对象
//        //引用类的属性
//        zhanghao.name = "张浩";
//        zhanghao.age = 9;
//        zhanghao.grade = 2;
//        zhanghao.hobby = "打游戏";
//        //引用类的方法
//        zhanghao.show();
//    }

//
//    String name;
//    int age;
//    String grade;
//    String hobby;
//
//    public void show() {
//        System.out.println("名字:" + name + "\n" + "年龄:" + age + "\n" + "年级:" + grade + "\n" + "爱好:" + hobby);
//    }
//
//    public static void main(String[] args) {
//        Day29 liming = new Day29();
//        liming.name = "李明";
//        liming.age = 17;
//        liming.grade = "1307java";
//        liming.hobby = "篮球";
//        liming.show();
//    }
    String name;
    String professional_direction;
    String professor_course;
    String grant_of_age;
    public void show() {
        System.out.println("名字:"+name+"\n"+"专业方向:"+professional_direction+"\n"+"教授课程:"
                +professor_course+"\n"+"授龄:"+grant_of_age);
    }
    public static void main(String[] args) {
        Day29 wanglaoshi = new Day29();
        wanglaoshi.name = "王老师";
        wanglaoshi.professional_direction ="java";
        wanglaoshi.professor_course = "java";
        wanglaoshi.grant_of_age = "10";
        wanglaoshi.show();
    }
  }
