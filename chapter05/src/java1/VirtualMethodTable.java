package java1;

/**
 * @Author: layman
 * @Date:Create：in 2021/5/6 8:59
 * @Description:
 */
interface Friendly {
    void sayHello();

    void sayGoodbye();
}

class Dog {
    public void sayHello() {

    }

    @Override
    public String toString() {
        return "java.Dog{}";
    }
}

class Cat implements Friendly {
    public void eat() {

    }

    @Override
    public void sayHello() {

    }

    @Override
    public void sayGoodbye() {

    }

    @Override
    protected void finalize() throws Throwable {

    }

    @Override
    public String toString() {
        return "java.Cat{}";
    }
}

class CockerSpaniel extends Dog implements Friendly {

    @Override
    public void sayHello() {
        super.sayHello();
    }

    @Override
    public void sayGoodbye() {

    }
}

public class VirtualMethodTable {
    public static void main(String[] args) {
        new CockerSpaniel().sayGoodbye();
        new Cat().eat();
        new Dog().sayHello();
    }
}
