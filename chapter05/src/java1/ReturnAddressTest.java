package java1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

/**
 * @Author: layman
 * @Date:Create：in 2021/5/6 9:14
 * @Description:
 */
public class ReturnAddressTest {
    public boolean methodBoolean() {
        return false;
    }

    public byte methodByte() {
        return 0;
    }

    public short methodShort() {
        return 0;
    }

    public char methodChar() {
        return 'a';
    }

    public int methodInt() {
        return 0;
    }

    public long methodLong() {
        return 0L;
    }

    public float methodFloat() {
        return 0.0F;
    }

    public double methodDouble() {
        return 0.0;
    }

    public String methodString() {
        return null;
    }

    public Date methodDate() {
        return null;
    }

    public void methodVoid() {
        return;
    }

    static {
        int i = 10;
    }

    public void method2() {
        try {
            method1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void method1() throws IOException {
        FileReader fileReader = new FileReader("shun.txt");
        char[] buffer = new char[1024];
        int len;
        while ((len = fileReader.read(buffer)) != -1) {
            String s = new String(buffer, 0, len);
            System.out.println(s);
        }
        fileReader.close();
    }

    public static void main(String[] args) throws IOException {
        new ReturnAddressTest().method1();

    }
}
