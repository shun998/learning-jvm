/**
 * @Author: layman
 * @Date:Create：in 2021/5/6 10:55
 * @Description:-Xms10m -Xmx10m
 */
public class HeapDemo1 {
    public static void main(String[] args) {
        System.out.println("start ...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end ...");
    }
}
