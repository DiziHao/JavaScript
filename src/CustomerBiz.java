import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 * Created by 邸子豪 on 2017/3/30.
 */
public class CustomerBiz {
    public static void main(String[] args) {
        Client cus = new Client();
        cus.name = "张三";
        System.out.println(cus.abbName(cus.name));
    }
}
