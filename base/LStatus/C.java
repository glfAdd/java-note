package base.LStatus;

public class C extends B {
    static {
        System.out.println("C 静态初始化块");
    }

    {
        System.out.println("C 普通初始化块");
    }

    public C() {
        super(100);
        System.out.println("C 的构造器");
    }
}
