/**
 * @Author: layman
 * @Date:Create：in 2021/5/9 14:30
 * @Description:
 */
public class StringGCTest {
    public static void main(String[] args) {
        for (int j = 0; j < 1000000; j++) {
            String.valueOf(j).intern();
        }
    }
}
