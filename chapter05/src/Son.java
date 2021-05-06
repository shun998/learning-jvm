
/**
 * @Author: layman
 * @Date:Create：in 2021/5/5 18:21
 * @Description:INVOKESTATIC和INVOKESPECIAL都是非虚方法
 */
class Father {
    public Father() {
        System.out.println("father的构造器");
    }

    public static void showStatic(String str) {
        System.out.println("father" + str);
    }

    public final void showFinal() {
        System.out.println("father show final");
    }

    public void showCommon() {
        System.out.println("father 普通方法");
    }
}

public class Son extends Father {
    public Son() {
        //INVOKESPECIAL
        super();
    }

    public Son(int age) {
        //INVOKESPECIAL
        this();
    }

    //不是重写的父类方法,静态方法不能被重写
    public static void showStatic(String str) {
        System.out.println("son" + str);
    }

    public void showPrivate(String str) {
        System.out.println("son private" + str);
    }

    public void show() {
        //INVOKESTATIC
        showStatic("hello world");
        //INVOKESTATIC
        super.showStatic("good");
        //INVOKESPECIAL
        showPrivate("hello");
        //INVOKESPECIAL
        super.showCommon();
        //INVOKEVIRTUAL
        showFinal();//因为此方法声明有final,不能被子类重写,所以此方法是非虚方法
        //INVOKEVIRTUAL
        showCommon();
        //INVOKEVIRTUAL
        info();
        MethodInterface in = null;
        //INVOKEINTERFACE
        in.methodA();
    }

    public void info() {
    }

    public void display(Father father) {
        father.showCommon();
    }
}
interface MethodInterface{
    void methodA();
}
