/**
 * @Author: layman
 * @Date:Create：in 2021/5/9 14:08
 * @Description:
 */
public class StringExer2 {
    public static void main(String[] args) {
        String s1="ab";
//        String s1 = new String("a") + new String("b");//new String("ab")
        //上一行代码的执行并没有在常量池中创建"ab"
        s1.intern();
        String s2 = "ab";
        System.out.println(s1 == s2);
    }
}
