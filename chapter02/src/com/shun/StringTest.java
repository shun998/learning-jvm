package com.shun;


/**
 * @Author: layman
 * @Date:Create：in 2021/5/5 10:33
 * @Description:
 */
public class StringTest {
    public static void main(String[] args) {
        java.lang.String str = new java.lang.String();//委任上一层,依次到引导类加载器
        System.out.println("hello world");
        StringTest stringTest = new StringTest();
        System.out.println(stringTest.getClass().getClassLoader());//sun.misc.Launcher$AppClassLoader@18b4aac2
    }
}
