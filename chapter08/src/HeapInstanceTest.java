import java.util.ArrayList;
import java.util.Random;

/**
 * @Author: layman
 * @Date:Create：in 2021/5/6 13:44
 * @Description:java.lang.OutOfMemoryError: Java heap space
 */
public class HeapInstanceTest {
    byte[] buffer = new byte[new Random().nextInt(1024 * 1024)];

    public static void main(String[] args) {
        ArrayList<HeapInstanceTest> list = new ArrayList<>();
        while (true){
            list.add(new HeapInstanceTest());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
