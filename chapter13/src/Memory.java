/**
 * @Author: layman
 * @Date:Create：in 2021/5/9 11:52
 * @Description:
 */
public class Memory {
    public static void main(String[] args) {
        int i = 1;
        Object object = new Object();
        Memory memory = new Memory();
        memory.foo(object);
    }

    private void foo(Object object) {
        String str = object.toString();
        System.out.println(str);
    }
}
