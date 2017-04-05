/**
 *reated by 邸子豪 on 2017/4/1.
 */
public class Human {
    public String name;//名字
    public char gender;//性别
    public int age;//年龄
    public double height;
    public double weight;
    //constructor
//    public void study(){
//    }
    public Human(String name, char gender, int age, double height, double weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public static void mian(String[] args) {
//        Human human = new Human("Tom")
    }
    //void adj./空的；无效的；无人的
    public String study(int studyTime){
        System.out.println(name +"学习了" + studyTime + "小时");
        return"一份英语作业";
    }

    public void work(boolean b) {
        if (b){
            return;
        }
        //...
        //...
        //...
        //...
        if (b) {

        } else {

        }
    }

    public void eat() {

    }

    public void sleep() {

    }
}

