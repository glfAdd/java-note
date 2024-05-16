package base.LStatus;

public class A {
    static {
        System.out.println("A 静态初始化块");
    }

    {
        System.out.println("A 普通初始化块");
    }

    public A() {
        super();
        System.out.println("A 无参数的构造器");
    }
}
