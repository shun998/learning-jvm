import org.junit.Test;

/**
 * @Author: layman
 * @Date:Create：in 2021/5/9 12:21
 * @Description: "a".intern()
 * new String("a").intern()
 * new StringBuilder("a").toString().intern()
 */
public class StringTest5 {
    @Test
    public void test1() {
        String s1 = "a" + "b" + "c";//等同于"abc"
        String s2 = "abc";//"abc"一定是放在常量池中,将此地址值赋给s2
        /**
         * .java编译成.class,执行.class
         * "abc"放在字符串常量池中
         * String s1="abc";
         * String s2="abc";
         */
        System.out.println(s1 == s2);//true
        System.out.println(s1.equals(s2));//true
    }

    @Test
    public void test2() {
        String s1 = "javaEE";
        String s2 = "hadoop";
        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop";//编译器优化
        String s5 = s1 + "hadoop";//如果拼接符号的前后出现了变量,则相当于在堆空间中new String(),具体的内容为拼接的结果
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;
        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s3 == s7);//false
        System.out.println(s5 == s6);//false
        System.out.println(s5 == s7);//false
        System.out.println(s6 == s7);//false
        //intern():判断字符串常量池中是否存在"javaEEhadoop",存在就返回常量池中"javaEEhadoop"的地址
        //不存在就加载一份,并返回其地址
        String s8 = s6.intern();
        System.out.println(s3 == s8);//true
    }

    @Test
    public void test3() {
        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";
        /**
         * NEW java/lang/StringBuilder
         *     DUP
         *     INVOKESPECIAL java/lang/StringBuilder.<init> ()V
         *     ALOAD 1
         *     INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         *     ALOAD 2
         *     INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         *     INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
         *     ASTORE 4
         *
         *     理解:new StringBuilder()  append()  append()  toString()  -->类似于new String("ab")
         *     jdk5以后的使用的new StringBuilder()
         */
        String s4 = s1 + s2;
        System.out.println(s3 == s4);//false
    }

    //字符串常量或者常量优化,使用的是编译器优化
    //否则是StringBuilder
    //针对final,能使用其修饰,建议使用
    @Test
    public void test4() {
        final String s1 = "a";
        final String s2 = "b";
        String s3 = "ab";
        String s4 = s1 + s2;
        System.out.println(s3 == s4);//true
    }

    @Test
    public void test5() {
        String s1 = "javaEEhadoop";
        String s2 = "javaEE";
        String s3 = s2 + "hadoop";
        System.out.println(s1 == s3);//false
        final String s4 = "javaEE";
        String s5 = s4 + "hadoop";
        System.out.println(s1 == s5);//true
    }
//StringBuilder的append方式,自始至终之外创建了一个对象
//String的拼接方式,创建过多个StringBuilder,以及toString时创建的String对象
    //内存中由于创建了过多的StringBuilder和String,占用内存大,如果进行gc,会花费大量的时间
    //改进:StringBuilder默认16,如果基本确定容量,可以使用构造器new StringBuilder(highLevel)

    @Test
    public void test6() {
        long start = System.currentTimeMillis();
//        method1(100000);//5261
        method2(100000);//5
        long end = System.currentTimeMillis();
        System.out.println("一共花费时间: " + (end - start));
    }

    private void method2(int highLevel) {
        StringBuilder src = new StringBuilder(10000000);
        for (int i = 0; i < highLevel; i++) {
            src.append("a");
        }
//        System.out.println(src);
    }

    private void method1(int hightLevel) {
        String src = "";
        for (int i = 0; i < hightLevel; i++) {
            src = src + "a";//每次都会创建一个StringBuilder,String
        }
//        System.out.println(src);
    }
}
