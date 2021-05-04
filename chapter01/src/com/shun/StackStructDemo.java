package com.shun;

/**
 * @Author: layman
 * @Date:Create：in 2021/5/4 21:11
 * @Description:
 */
public class StackStructDemo {
    public static void main(String[] args) {
//        int i=1+4;
        int i = 1;
        int j = 9;
        int n = i + j;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("over...");
    }
}
