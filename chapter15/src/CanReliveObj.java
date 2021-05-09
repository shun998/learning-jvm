/**
 * @Author: layman
 * @Date:Create：in 2021/5/9 15:42
 * @Description:
 */
public class CanReliveObj {
    public static CanReliveObj obj;//类变量,属于GC Root

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("调用当前类重写的finalize方法.");
        obj = this;
    }

    public static void main(String[] args) {
        try {
            obj = new CanReliveObj();
            //对象第一次成功自救
            obj = null;
            System.gc();
            System.out.println("第一次 gc");
            //因为Finalizer线程优先级很低,所以等待两秒
            Thread.sleep(2000);
            if (obj == null) {
                System.out.println("obj is dead");
            } else {
                System.out.println("obj is still alive");
            }
            System.out.println("第二次 gc");
            obj = null;
            System.gc();
            if (obj == null) {
                System.out.println("obj is dead");
            } else {
                System.out.println("obj is still alive");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
