/**
 * @Author: layman
 * @Date:Create：in 2021/5/5 17:35
 * @Description:
 */
public class DynamicLinkingTest {
    int num = 10;

    public void methodA() {
        System.out.println("methodA()...");
    }

    public void methodB() {
        System.out.println("methodB()...");
        methodA();
        num++;
    }
}
