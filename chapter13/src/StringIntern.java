/**
 * @Author: layman
 * @Date:Create：in 2021/5/9 13:40
 * @Description:
 */
public class StringIntern {
    public static void main(String[] args) {
        String s1 = new String("1");
        s1.intern();//字符串常量池中已经有1
        String s2 = "1";
        System.out.println(s1 == s2);//jdk6 false  jdk7/8 false
        String s3 = new String("1") + new String("1");//相当于new String("11")
        s3.intern();//执行完上一行的代码以后,常量池中不存在11
        //jdk6创建的对象11,也就有了新地址
        //jdk7此时常量池中并没有创建常量11,而是创建了一个指向堆地址
        String s4 = "11";
        System.out.println(s3 == s4);//jdk6 false   jdk7/8 true
    }
}
