import java.util.ArrayList;

/**
 * @Author: layman
 * @Date:Create：in 2021/5/8 13:59
 * @Description:
 */
public class JITTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add("layman");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
