/**
 * @Author: layman
 * @Date:Create：in 2021/5/6 8:47
 * @Description:体会invokeDynamic指令
 */
@FunctionalInterface
interface Func {
    public boolean func(String str);
}

public class Lambda {
    public void lambda(Func func) {
        return;
    }

    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        Func func = s -> {
            return true;
        };
//        INVOKEDYNAMIC
        lambda.lambda(func);
        lambda.lambda(s -> {
            return true;
        });
    }
}
