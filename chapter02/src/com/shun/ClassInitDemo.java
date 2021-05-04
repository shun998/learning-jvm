package com.shun;

/**
 * @Author: layman
 * @Date:Create：in 2021/5/4 22:30
 * @Description:
 */
public class ClassInitDemo {
   private static int num=1;
   static {
       num=2;
       number=10;
       System.out.println(num);
//       System.out.println(number);//Illegal forward reference
   }
    static int number = 9;//prepare number=0 // init number从10到9

    public static void main(String[] args) {
        System.out.println(ClassInitDemo.num);
    }
}
