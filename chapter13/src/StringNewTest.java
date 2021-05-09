/**
 * @Author: layman
 * @Date:Create：in 2021/5/9 13:26
 * @Description: String s=new String("ab");
 * 创建了两个对象
 * 1.NEW java/lang/String
 * 2.LDC "ab"
 *
 *      String s2 = new String("a") + new String("b");
 *      1.new StringBuilder()
 *      2.new String("a")
 *      3.ldc "a"
 *      4.new String("b")
 *      5. ldc "b"
 *      6.深入剖析new StringBuilder().toString():
 *          new String("ab")
 *          强调:toString的调用,没有在常量池中生成"ab"
 */
public class StringNewTest {
    public static void main(String[] args) {
        //   NEW java/lang/String
        //    DUP
        //    LDC "ab"
        //两个对象:new 在堆空间创建的
//        字符串常量池中的对象,ldc
//        String s = new String("ab");
        //NEW java/lang/String
        //LDC "ab"
//        NEW java/lang/StringBuilder
        String s2 = new String("a") + new String("b");

    }
}
