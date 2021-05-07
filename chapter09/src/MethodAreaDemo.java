/**
 * @Author: layman
 * @Date:Create：in 2021/5/7 9:06
 * @Description:non-final的类变量
 */
public class MethodAreaDemo {
    public static void main(String[] args) {
        Order order = null;
        order.hello();
        System.out.println(Order.count);
        //hello 此处还是会有方法的使用
        //1
    }
}

class Order {
    public static int count = 1;
    public static final int number = 2;

    public static void hello() {
        System.out.println("hello");
    }
}