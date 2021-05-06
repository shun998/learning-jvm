/**
 * @Author: layman
 * @Date:Create：in 2021/5/6 11:12
 * @Description:
 */
public class SimpleHeap {
    private int id;//属性,成员变量

    public SimpleHeap(int id) {
        this.id = id;
    }
    public void show(){
        System.out.println("my id is :"+id);
    }

    public static void main(String[] args) {
        SimpleHeap heap1 = new SimpleHeap(1);
        SimpleHeap heap2 = new SimpleHeap(2);
        int[] arr = new int[10];
        Object[] objects = new Object[10];
    }
}
