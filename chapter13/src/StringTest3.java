import java.util.HashSet;
import java.util.Set;

/**
 * @Author: layman
 * @Date:Create：in 2021/5/9 11:47
 * @Description:
 */
public class StringTest3 {
    public static void main(String[] args) {
        //使用set保持着常量池的引用,避免full gc回收常量池的行为
        Set<String> hashSet = new HashSet<>();
        //在short可以取值的范围内足以让6mb的Permsize火heap产生oom
        short i=0;
        while (true){
            hashSet.add(String.valueOf(i++).intern());
        }
    }
}
