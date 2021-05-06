package com.shun;

import sun.misc.Launcher;

import java.net.URL;

/**
 * @Author: layman
 * @Date:Create：in 2021/5/5 9:47
 * @Description:
 */
public class ClassLoaderTest1 {
    public static void main(String[] args) {
        System.out.println("********启动类加载器*********");
        //获取BootstrapClassLoader能够加载的api的路径
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL urL : urLs) {
            System.out.println(urL.toExternalForm());
        }
        //file:/D:/install/Java/jdk1.8.0_281/jre/lib/resources.jar
        //file:/D:/install/Java/jdk1.8.0_281/jre/lib/rt.jar
        //file:/D:/install/Java/jdk1.8.0_281/jre/lib/sunrsasign.jar
        //file:/D:/install/Java/jdk1.8.0_281/jre/lib/jsse.jar
        //file:/D:/install/Java/jdk1.8.0_281/jre/lib/jce.jar
        //file:/D:/install/Java/jdk1.8.0_281/jre/lib/charsets.jar
        //file:/D:/install/Java/jdk1.8.0_281/jre/lib/jfr.jar
        //file:/D:/install/Java/jdk1.8.0_281/jre/classes
        // 从上面的路径中任选一个类,看看他们的加载器是什么
        System.out.println("********扩展类加载器*********");
        String extDirs = System.getProperty("java.ext.dirs");
        for (String path : extDirs.split(";")) {
            System.out.println(path);
        }
        //D:\install\Java\jdk1.8.0_281\jre\lib\ext
        //C:\WINDOWS\Sun\Java\lib\ext

    }
}
