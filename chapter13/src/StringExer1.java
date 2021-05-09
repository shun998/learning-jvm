
/**
 * @Author: layman
 * @Date:Create：in 2021/5/9 13:59
 * @Description:
 */
public class StringExer1 {
    public static void main(String[] args) {
        String s = "ab";
        String s1 = new String("a") + new String("b");//new String("ab")
        String s2 = s1.intern();
        System.out.println(s2 == "ab");//true //true
        System.out.println(s1 == "ab");//true //false
    }
}
