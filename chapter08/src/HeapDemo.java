/**
 * @Author: layman
 * @Date:Create：in 2021/5/6 10:55
 * @Description:-Xms20m -Xmx20m
 */
public class HeapDemo {
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
