import org.junit.Test;

/**
 * @Author: layman
 * @Date:Create：in 2021/5/8 15:28
 * @Description:
 */
public class StringTest {
    @Test
    public void test1() {
        String s1 = "abc";//字面量定义的方式,"abc"存储在字符串常量池中
        String s2 = "abc";
//        s1="hello";
        System.out.println(s1 == s2);//true
        System.out.println(s1);
        System.out.println(s2);
    }

    @Test
    public void test2() {
        String s1 = "abc";//字面量定义的方式,"abc"存储在字符串常量池中
        String s2 = "abc";
        s2 += "def";
        System.out.println(s1 == s2);//true
        System.out.println(s1);
        System.out.println(s2);
    }

    @Test
    public void test3() {
        String s1 = "abc";//字面量定义的方式,"abc"存储在字符串常量池中
        String s2 = s1.replace('a', 'm');
        System.out.println(s1);
        System.out.println(s2);
    }
}
