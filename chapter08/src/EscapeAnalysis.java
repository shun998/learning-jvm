/**
 * @Author: layman
 * @Date:Create：in 2021/5/6 15:48
 * @Description:逃逸分析: 如何快速判断是否发生了逃逸, 就看new的对象的实体是否有可能在方法外被调用
 * 总结:开发的时候,能使用局部变量的,就不用在方法外定义
 */
public class EscapeAnalysis {
    public EscapeAnalysis obj;

    //方法返回EscapeAnalysis,发生逃逸
    public EscapeAnalysis getInstance() {
        return obj == null ? new EscapeAnalysis() : obj;
    }

    //为成员属性赋值,发生逃逸
    public void setObj() {
        this.obj = new EscapeAnalysis();
    }

    //对象的作用域仅在当前方法中有效,没有发生逃逸
    //如果当前的obj引用声明为static,仍然会发生逃逸
    public void useEscapeAnalysis1() {
        EscapeAnalysis instance = getInstance();
        //getInstance().xxx同样会发生逃逸
    }


}
