/**
 * @Author: layman
 * @Date:Create：in 2021/5/5 16:30
 * @Description:
 */
public class TestAddOperation {
    public static void main(String[] args) {
        //byte short char boolean 都以int型保存
        byte i = 5;
        int j = 8;
        int k = i + j;
    }

    public int getSum() {
        int i = 10;
        int j = 20;
        int k = i + j;
        return k;
    }

    public void testGetSum() {
        int i = getSum();
        int j = 20;
    }

    public void add() {
        //第一类问题
        int i1 = 10;
        i1++;
        int i2 = 10;
        ++i2;
        //第二类问题
        int i3 = 10;
        int i4 = i3++;
        int i5 = 10;
        int i6 = ++i5;
        //第三类问题
        int i7 = 10;
        i7 = i7++;
        int i8 = 10;
        i8 = ++i8;
        //第四类问题
        int i9 = 10;
        int i10 = i9++ + ++i9;
    }
}
/*
 * 面试中i++和++i的区别:
 *
 * */