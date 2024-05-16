package base.LStatus;

public class B extends A {
    static {
        System.out.println("B 静态初始化块");
    }

    {
        System.out.println("B 普通初始化块");
    }

    public B() {
        super();
        System.out.println("B 无参数的构造器");
    }

    public B(int t) {
        //通过this调用同一类中重载的构造器
        this();
        System.out.println("B 带参数构造器，其参数值：" + t);
    }
}
