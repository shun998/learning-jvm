/**
 * @Author: layman
 * @Date:Create：in 2021/5/7 10:45
 * @Description:静态的引用对应的实体始终都在堆空间中
 */
public class StaticFieldTest {
        private static byte[] bytes = new byte[100 * 1024 * 1024];//100m
    public static void main(String[] args) {
        System.out.println(StaticFieldTest.bytes);
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
