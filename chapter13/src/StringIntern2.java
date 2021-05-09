
/**
 * @Author: layman
 * @Date:Create：in 2021/5/9 14:17
 * @Description: 对于程序中, 存在大量字符串, 尤其是重复字符串, 使用intern提高空间效率
 */
public class StringIntern2 {
    static final int MAX_COUNT = 1000 * 1000;
    static final String[] arr = new String[MAX_COUNT];

    public static void main(String[] args) {
        Integer[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        long start = System.currentTimeMillis();
        for (int i = 0; i < MAX_COUNT; i++) {
            arr[i] = new String(String.valueOf(data[i % data.length]));
//            arr[i] = new String(String.valueOf(data[i % data.length])).intern();
        }
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为: " + (end - start));
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.gc();
    }
}
