/**
 * @Author: layman
 * @Date:Create：in 2021/5/5 15:09
 * @Description:
 */
public class StackFrameTest {
    public static void main(String[] args) {
        try {
            StackFrameTest stackFrameTest = new StackFrameTest();
            stackFrameTest.methodA();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("main()正常结束!");

    }

    public void methodA() {
        System.out.println("methodA() 开始执行!");
        methodB();
        System.out.println(1 / 0);
        System.out.println("methodA() 执行结束!");

    }

    private int methodB() {
        System.out.println("methodB() 开始执行!");
        int i = 10;
        int m = (int) methodC();
        System.out.println("methodB() 即将结束!");
        return i + m;
    }

    private double methodC() {
        System.out.println("methodC() 开始执行!");
        double j = 10.0;
        System.out.println("methodC() 即将结束!");
        return j;

    }
}
