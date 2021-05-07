import java.nio.ByteBuffer;
import java.util.Scanner;

/**
 * @Author: layman
 * @Date:Create：in 2021/5/7 16:49
 * @Description: IO     NIO
 * byte[]/char[]        Buffer
 * Stream               Channel
 */
public class BufferTest {
    private static final int BUFFER = 1024 * 1024 * 1024;//1G

    public static void main(String[] args) {
        //直接分配内存空间
        ByteBuffer buffer = ByteBuffer.allocateDirect(BUFFER);
        System.out.println("直接内存分配完毕~");
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        System.out.println("直接内存开始释放");
        buffer = null;
        System.gc();
        scanner.next();
    }
}
