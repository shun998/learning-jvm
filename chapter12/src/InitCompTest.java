/**
 * @Author: layman
 * @Date:Create：in 2021/5/8 14:14
 * @Description: //Xmixed 1193
 * //Xint 8044
 * //Xcomp 1263
 */
public class InitCompTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        testPrintPrimeNumber(1000000);
        long end = System.currentTimeMillis();
        System.out.println("一共花费时间为: " + (end - start));
        //mixed 1193
        //int 8044
        //comp 1263
    }

    private static void testPrintPrimeNumber(int count) {
        for (int i = 0; i < count; i++) {
            label:
            //100以内的质数
            for (int j = 2; j <= 100; j++) {
                for (int k = 2; k <= Math.sqrt(j); k++) {
                    if (j % k == 0) {
                        continue label;
                    }
                }
//                System.out.println(j);
            }
        }

    }
}
