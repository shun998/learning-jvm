package com.shun;

/**
 * @Author: layman
 * @Date:Create：in 2021/5/5 9:27
 * @Description:
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
//        获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2
        // 获取上层:扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);//sun.misc.Launcher$ExtClassLoader@1b6d3586
        // 获取上层
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);//null
        //对于用户自定义类:默认使用系统类加载器
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2
        //String的类加载器,使用引导类加载器->java的核心类库都是引导类加载器进行加载
        ClassLoader stringClassLoader = String.class.getClassLoader();
        System.out.println(stringClassLoader);//null
    }
}
