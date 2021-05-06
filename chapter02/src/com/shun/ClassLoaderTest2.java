package com.shun;

/**
 * @Author: layman
 * @Date:Create：in 2021/5/5 10:28
 * @Description:
 */
public class ClassLoaderTest2 {
    public static void main(String[] args) {
        try {
            //1
            ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoader);//null
            //2
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            System.out.println(contextClassLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2
            //3
            ClassLoader loader = ClassLoader.getSystemClassLoader().getParent();
            System.out.println(loader);//sun.misc.Launcher$ExtClassLoader@1b6d3586
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
