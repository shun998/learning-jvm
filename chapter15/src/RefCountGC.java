/**
 * @Author: layman
 * @Date:Create：in 2021/5/9 15:18
 * @Description: obj1和obj2被回收, 因此java并没有使用引用计数算法
 */
public class RefCountGC {
    private byte[] bigSize = new byte[5 * 1024 * 1024];
    Object ref = null;

    public static void main(String[] args) {
        RefCountGC obj1 = new RefCountGC();
        RefCountGC obj2 = new RefCountGC();
        obj1.ref = obj2;
        obj2.ref = obj1;
        obj1 = null;
        obj2 = null;
        System.gc();
    }
}
