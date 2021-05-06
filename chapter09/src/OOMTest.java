import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

/**
 * @Author: layman
 * @Date:Create：in 2021/5/6 20:06
 * @Description:
 * -XX:MetaspaceSize=100m -XX:MaxMetaspaceSize=100m
 * java.lang.OutOfMemoryError: Compressed class space
 */
public class OOMTest extends ClassLoader {
    public static void main(String[] args) {
        int j = 0;
        try {
            OOMTest oomTest = new OOMTest();
            for (int i = 0; i < 10000; i++) {
                //创建ClassWriter对象,用于生成类的二进制字节码
                ClassWriter classWriter = new ClassWriter(0);
                //版本号,修饰符,类名,包名,父类,接口
                classWriter.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, "Class" + i, null, "java/lang/Object", null);
                byte[] bytes = classWriter.toByteArray();
                oomTest.defineClass("Class" + i, bytes, 0, bytes.length);//Class对象
                j++;
            }
        } finally {
            System.out.println(j);
        }
    }
}
