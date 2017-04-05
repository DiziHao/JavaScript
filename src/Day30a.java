/**
 * Created by 邸子豪 on 2017/3/30.
 */
public class Day30a {
    //    int brand;//品牌
   String function;//功能

    public String juicer(String function) {
        System.out.println(function + "榨汁机");
        if (function.equals("1")) {
            return "苹果汁";
        } else if (function.equals("2")) {
            return "香蕉汁";
        } else {
            return "no";
        }
    }
}