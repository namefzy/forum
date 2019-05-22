package Source_Code_Analysis;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap源码解析
 * https://www.cnblogs.com/xiaoxi/p/7233201.html
 */
public class HashMapAnalysis {
    public static void main(String[] args) {
        Map map = new HashMap();
        System.out.println(map.put("a", "A")); // 打印null
        System.out.println(map.put("a", "AA")); // 打印A
        System.out.println(map.put("a", "AB")); // 打印AA
    }
}
