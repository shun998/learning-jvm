package com.shun;

import java.io.FileNotFoundException;

/**
 * @Author: layman
 * @Date:Create：in 2021/5/5 10:05
 * @Description:自定义加载器如果没有复杂的需求,不涉及到解密,可以继承URLClassLoader,不用重写findClass方法,否则,自定义加载器继承ClassLoader, 重写findClass方法
 */
public class CustomerClassLoader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            byte[] result = getClassFromCustomPath(name);
            if (result == null) {
                throw new FileNotFoundException();
            } else {
                return defineClass(name, result, 0, result.length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        throw new ClassNotFoundException();
    }

    private byte[] getClassFromCustomPath(String name) {
        //自定义路径加载指定类:细节略
        //如果指定路径的字节码有加密,则需要在此方法中进行解密操作
        return null;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        new CustomerClassLoader().findClass("tt");

    }
}
