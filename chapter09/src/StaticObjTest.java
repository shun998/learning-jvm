/**
 * @Author: layman
 * @Date:Create：in 2021/5/7 10:51
 * @Description:
 */
public class StaticObjTest {
    static class Test {
        static ObjectHolder staticObject = new ObjectHolder();
        ObjectHolder instanceObject = new ObjectHolder();

        void foo() {
            ObjectHolder localObject = new ObjectHolder();
            System.out.println("done ...");
        }
    }

    private static class ObjectHolder {

    }

    public static void main(String[] args) {
        Test test = new StaticObjTest.Test();
        test.foo();
    }
}
