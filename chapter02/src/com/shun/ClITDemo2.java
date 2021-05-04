package com.shun;

/**
 * @Author: layman
 * @Date:Create：in 2021/5/4 22:50
 * @Description:
 */
public class ClITDemo2 {
    static class Father {
        public static int A = 1;

        static {
            A = 2;
        }
    }

    static class Son extends Father {
        public static int B = A;
    }
    public static void main(String[] args) {
        System.out.println(Son.B);
    }
}
