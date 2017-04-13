package java1702.javase;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by 邸子豪 on 2017/4/12.
 * 使用 Map 接口的实现类完成员工工资(姓名→工资)的摸拟：
 添加几条信息
 列出所有的员工姓名
 列出所有员工姓名及其工资
 删除名叫 Tom 的员工信息
 输出 Jack 的工资，并将其工资改为 1500 元
 将所有工资低于 1000 元的员工的工资上涨 20%
 */
public class E1 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        map.put("Tom",3000);
        map.put("Jerry",600);
        map.put("Jack",600);
        for (String s : map.keySet()) {
            System.out.println(s);//输出人
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"->"+entry.getValue());//每个人和工资
        }
        map.remove("Tom");//删除Tom
        System.out.println(map);//删除Tom后其余的人和工资
        System.out.println(map.get("Jack"));//输出Jack修改前的工资
        map.put("Jack",1500);//把Jack修改成1500
        System.out.println(map.get("Jack"));//输出Jack修改后的工资

        for (String s : map.keySet()) {
            if (map.get(s) < 1000) {//判断1000以下的工资
                map.put(s,(int)(map.get(s)*1.2));//1000以下的涨20%1.2是自己的工资加20%
            }
        }
        System.out.println(map);//输出1000以下的涨到多少工资
    }
}
