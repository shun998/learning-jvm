import org.junit.Test;

/**
 * @Author: layman
 * @Date:Create：in 2021/5/8 16:23
 * @Description: 字符串常量池中不会存储相同的字符串
 */
public class StringExer {
    String str = new String("good");
    char[] chs = {'t', 'e', 's', 't'};

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'b';
    }

    @Test
    public void test1() {
        StringExer exer = new StringExer();
        exer.change(exer.str, exer.chs);
        System.out.println(exer.str);
        System.out.println(exer.chs);

    }
}
