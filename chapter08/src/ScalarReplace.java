/**
 * @Author: layman
 * @Date:Create：in 2021/5/6 16:58
 * @Description:标量替换
 */
public class ScalarReplace {
    public static class User {
        public int id;
        public String name;
    }

    public static void allocation() {
        User user = new User();
        user.id = 5;
        user.name = "layman";
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            allocation();
        }
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为:" + (end - start) + "ms");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
