import java.nio.ByteBuffer;
import java.util.ArrayList;

/**
 * @Author: layman
 * @Date:Create：in 2021/5/8 12:41
 * @Description:
 */
public class BufferTest2 {
    private static final int BUFFER = 1024 * 1024 * 20;

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        int count = 0;
        try {
            while (true) {
                ByteBuffer byteBuffer = ByteBuffer.allocateDirect(BUFFER);
                list.add(byteBuffer);
                count++;
                try {
                    Thread.sleep(1000000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            System.out.println(count);
        }
    }
}
