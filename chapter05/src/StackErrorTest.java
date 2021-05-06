/**
 * @Author: layman
 * @Date:Create：in 2021/5/5 14:50
 * @Description:演示栈中的异常
 * 默认情况:a=11402
 * 设置栈的大小:-Xss256k a=2457
 *
 */
public class StackErrorTest {
    private static int a = 1;

    public static void main(String[] args) {
        System.out.println(a);//11402
        a++;
        main(args);//java.lang.StackOverflowError
    }
}
