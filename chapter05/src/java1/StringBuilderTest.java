package java1;

import java.lang.reflect.Member;

/**
 * @Author: layman
 * @Date:Create：in 2021/5/6 10:00
 * @Description:面试题:方法中定义的局部变量是否是线程安全的?具体问题具体分析: 何为线程安全?
 * 如果只有一个线程可以操作次数据,则必定是线程安全的
 * 如果过个线程可以操作此数据,则此数据是共享数据 .如果不考虑同步机制,会存在线程安全问题
 * 内部使用,内部消亡,就是安全的
 */
public class StringBuilderTest {
    //stringBuilder1的声明是线程安全的,因为StringBuilder在内部使用,没有被其他线程共享的可能性
    //StringBuilder线程不安全
    public static void method1() {
        StringBuilder stringBuilder1 = new StringBuilder();
        //StringBuilder的操作是线程不安全的
        stringBuilder1.append("a");
        stringBuilder1.append("b");
        //...
    }

    //StringBuilder的操作是线程不安全的
    public static void method2(StringBuilder stringBuilder2) {
        stringBuilder2.append("a");
        stringBuilder2.append("b");

    }

    //StringBuilder的操作是线程不安全的
    public static StringBuilder method3() {
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("a");
        stringBuilder3.append("b");
        return stringBuilder3;
    }

    //线程是安全的,stringBuilder内部消亡
    public static String method4() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("a");
        stringBuilder.append("b");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        new Thread(() -> {
            builder.append("a");
            builder.append("b");
        }).start();
        method2(builder);

    }
}
