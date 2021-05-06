package java.lang;

/**
 * @Author: layman
 * @Date:Create：in 2021/5/5 10:38
 * @Description: 判断同一个类:类路径一样,ClassLoader一样
 */
public class String {
    static {
        System.out.println("自定义String类的静态代码块");
    }
//在类 java.lang.String 中找不到 main 方法, 请将 main 方法定义为:
    public static void main(String[] args) {
        System.out.println("自定义String的main方法");
    }
}
