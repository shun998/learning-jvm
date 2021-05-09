/**
 * @Author: layman
 * @Date:Create：in 2021/5/9 13:52
 * @Description:
 */
public class StringIntern1 {
    public static void main(String[] args) {
        String s3 = new String("1") + new String("1");//相当于new String("11")
        String s4 = "11";
        String s5 = s3.intern();
        System.out.println(s3 == s4);//false
        System.out.println(s5 == s4);//true
    }
}
