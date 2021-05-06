/**
 * @Author: layman
 * @Date:Create：in 2021/5/6 10:27
 * @Description:native有方法体,并不是java实现的,abstract没有方法体,native和abstract不能同时使用
 */
public class IHaveNative {
    public native void Native1(int x);

    public native static long Native2();

    private native synchronized float Native3(Object o);

    native void Native4(int[] array) throws Exception;
}
