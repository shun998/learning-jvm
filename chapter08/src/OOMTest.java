import java.util.ArrayList;
import java.util.Random;

/**
 * @Author: layman
 * @Date:Create：in 2021/5/6 12:59
 * @Description:java.lang.OutOfMemoryError: Java heap space
 */
public class OOMTest {
    public static void main(String[] args) {
        ArrayList<Picture> pictures = new ArrayList<>();
        while (true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            pictures.add(new Picture(new Random().nextInt(1024 * 1024)));
        }

    }
}

class Picture {
    private byte[] pixels;

    public Picture(int length) {
        this.pixels = new byte[length];
    }
}