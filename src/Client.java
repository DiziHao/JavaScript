/**
 * Created by 邸子豪 on 2017/3/30.
 */
public class Client {
    String name;//客户名字
    String[] allName = new String[9];
    int i = 0;

    public boolean abbName(String ClientName) {
        if (i < 9) {
            allName[i] = ClientName;
            i++;
        }
        for (int j = 0; j <= i; j++) {
            if (allName[j].equals(ClientName)) {
                return true;
            }
        }
        return false;
    }
}