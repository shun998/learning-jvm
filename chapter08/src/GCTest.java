import java.util.ArrayList;

/**
 * @Author: layman
 * @Date:Create：in 2021/5/6 14:50
 * @Description:-Xms9m -Xmx9m -XX:+PrintGCDetails
 */
public class GCTest {
    public static void main(String[] args) {
        int i = 0;
        try {
            ArrayList<String> list = new ArrayList<>();
            String a = "shun";
            while (true) {
                list.add(a);
                a = a + a;
                i++;
            }
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("遍历次数为: " + i);
        }
    }
}
