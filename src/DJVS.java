import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.awt.geom.Arc2D;
import java.security.PublicKey;
import java.util.Scanner;

/**
 * Created by 邸子豪 on 2017/3/15.
 */
//电话费用（免费接电）
//        某电话公司电话收费有三个套餐
//        ①月租50元包100分，超出100分，1元/分，200元封顶
//        ②月租50元包100分，超出100分，0.85/分，不封顶
//        ③无月租，0.75/分，不封顶
//        根据所输入的通话分数，给出推荐的套餐

//public class DJVS {
//    public static void main(Scanner[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("输入通话分钟x");
//        Double x = input.nextDouble();
//        if (x * 0.75 < 200) {
//            System.out.println("推荐使用套餐3");
//        } else if (x * 0.85 > 200) {
//            System.out.println("推荐使用套餐2");
//        }
//        if ((x - 100) * 1 < 200){
//            System.out.println("推荐使用套餐1或2");
//        }else {
//            System.out.println("推荐使用套餐1");
//        }
//       int a =100;
//        while (a < 1000) {
//            int x = a%10;
//            int y = (a/10)%10;
//            int z = (a%10);
//        }
//        if (x * x * x * y * y * y * z * z * z == a) {

//    }
//    }
//    }
//}