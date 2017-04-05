/**
 * Created by 邸子豪 on 2017/3/29.
 * 下载视频，播放视频，
 */
public class Phone {
    String band;
    public void TestPhone() {
        System.out.println("手机品牌:"+band+ "\n"+"功能:\n1.播放下载的视频;\n2.播放视频;");
    }

    public static void main(String[] args) {
        Phone VIVI = new Phone();
        VIVI.band = "vivi";
        VIVI.TestPhone();
        Cell A = new Cell();
        A.brand = "双鹿";
        A.TestPhone();
    }
}
