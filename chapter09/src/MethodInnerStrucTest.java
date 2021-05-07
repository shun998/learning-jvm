import java.io.Serializable;

/**
 * @Author: layman
 * @Date:Create：in 2021/5/7 8:46
 * @Description:
 */
public class MethodInnerStrucTest extends Object implements Comparable<String>, Serializable {
    public int num = 10;
    private static String str = "测试内部方法的内部结构";

    //默认有空参构造器
    public void test1() {
        int count = 20;
        System.out.println("count: " + count);
    }

    public static int test2(int cal) {
        int result = 0;
        try {
            int value = 30;
            result = value / cal;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
