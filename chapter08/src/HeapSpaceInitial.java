/**
 * @Author: layman
 * @Date:Create：in 2021/5/6 12:18
 * @Description:-Xms 用于设置堆空间(年轻代+老年代)的初始值大小
 *      -X jvm运行时参数
 *      ms memoryStart
 *      -Xmx 用于设置堆空间(年轻代+老年代)的最大值大小
 *      默认堆空间的大小
 *      初始内存大小:物理内存大小/64
 *      最大内存大小:物理内存大小/4
 *      默认
 * -Xms: 184M
 * -Xmx: 2709M
 * 系统内存大小为: 11.5G
 * 系统内存大小为: 10.58203125G
 * -Xms600m -Xmx600m
 * -Xms: 575M
 * -Xmx: 575M
 * 系统内存大小为: 35.9375G
 * 系统内存大小为: 2.24609375G
 * 查看方法:1.
 * C:\Users\22908>jps
 * 3476 Launcher
 * 6116
 * 15004 Jps
 * 9996 HeapSpaceInitial
 *
 * C:\Users\22908>jstat -gc 9996
 *  S0C    S1C    S0U    S1U      EC       EU        OC         OU       MC     MU    CCSC   CCSU   YGC     YGCT    FGC    FGCT     GCT
 * 25600.0 25600.0  0.0    0.0   153600.0 12288.1   409600.0     0.0     4480.0 777.2  384.0   76.6       0    0.000   0      0.000    0.000
 * 2.-XX:+PrintGCDetails
 */
public class HeapSpaceInitial {
    public static void main(String[] args) {
        //获取jvm的堆内存总量
        long initialMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        //获取jvm最大的堆内存量
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;
        System.out.println("-Xms: "+initialMemory+"M");
        System.out.println("-Xmx: "+maxMemory+"M");
        System.out.println("系统内存大小为: "+initialMemory*64.0/1024+"G");
        System.out.println("系统内存大小为: "+maxMemory*4.0/1024+"G");
//        try {
//            Thread.sleep(1000000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
