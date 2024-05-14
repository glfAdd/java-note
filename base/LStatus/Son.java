package base.LStatus;

public class Son extends Father {
    //静态代码块
    static {
        System.out.println("Son static");
    }

    //构造方法
    public Son() {
        System.out.println("Son constructor");
    }

    public static void main(String[] args) {
        new Son();
    }
}
