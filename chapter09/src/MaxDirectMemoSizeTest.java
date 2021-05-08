import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @Author: layman
 * @Date:Create：in 2021/5/8 12:48
 * @Description:
 */
public class MaxDirectMemoSizeTest {
    private static final long _1MB = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            unsafe.allocateMemory(_1MB);//OutOfMemoryError
        }
    }
}
