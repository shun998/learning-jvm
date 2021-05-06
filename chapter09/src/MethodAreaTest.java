/**
 * @Author: layman
 * @Date:Create：in 2021/5/6 20:01
 * @Description:jdk7及以前:-XX:PermSize=100m -XX:MaxPermSize=100m
 * jdk8及以后-XX:MetaspaceSize=100m -XX:MaxMetaspaceSize=100m
 */
public class MethodAreaTest {
    public static void main(String[] args) {
        System.out.println("start ...");
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end ...");
    }
}
