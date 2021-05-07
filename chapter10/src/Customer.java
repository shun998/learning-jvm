/**
 * @Author: layman
 * @Date:Create：in 2021/5/7 12:48
 * @Description:给对象属性赋值的操作: 属性的默认初始化  显示初始化 代码块中初始化 构造器中初始化
 * 测试对象实例化的过程:
 * 1.加载元信息
 * 2.为对象分配内存
 * 3. 处理并发问题
 * 4. 属性的初始化(零值初始化)
 * 5. 设置对象头信息
 * 6. 属性的显式初始化 代码中的初始化 构造器中的初始化
 */
public class Customer {
    int id = 100;
    String name;
    Account account;

    {
        name = "匿名客户";
    }

    public Customer() {
        account = new Account();
    }
}

class Account {

}