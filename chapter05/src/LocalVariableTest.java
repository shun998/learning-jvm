import java.util.Date;

/**
 * @Author: layman
 * @Date:Create：in 2021/5/5 15:31
 * @Description:
 */
public class LocalVariableTest {
    private int count = 0;

    public static void main(String[] args) {
        LocalVariableTest localVariableTest = new LocalVariableTest();
        int num = 10;
        localVariableTest.test1();
    }

    //关于slot的使用的理解
    public LocalVariableTest() {
        this.count = 10;
    }

    //练习
    public static void staticTest() {
        LocalVariableTest localVariableTest = new LocalVariableTest();
        Date date = new Date();
        int count = 10;
        System.out.println(count);
//        因为this变量不存在于当前方法的局部变量表中
//        System.out.println(this.count);
    }

    public void test1() {
        Date date = new Date();
        String name1 = "hello world";
        String info = test2(date, name1);
        System.out.println(date + name1);
    }

    public String test2(Date dateP, String name2) {
        dateP = null;
        name2 = "shun";
        double weight = 120.5;//占据两个slot
        char gender = '男';
        return dateP + name2;

    }

    public void test3() {
        count++;
    }

    public void test4() {
        int a = 0;
        {
            int b = 0;
            b = a + 1;
        }
        //使用的c是已经销毁的b的slot的位置
        int c = a + 1;
    }

    public void testTemp() {
        int tt;
//        System.out.println(tt);//Variable 'tt' might not have been initialized
    }
}
/*
 * 变量的分类:
 * 按照数据类型分类:1.基本数据类型 2.引用数据类型
 * 按照在类中声明的位置分类:
 * 1.成员变量 :类变量 再使用前,都经历过默认初始化赋值linking的prepare阶段给类变量有赋值-->
 * initial阶段:给类变量显式赋值即静态代码块
 * 实例变量:随着对象的创建,会在堆空间中分配实例变量空间,并进行默认赋值
 * 2.局部变量:在使用前,必须要进行显式赋值!否则,编译不通过
 * */