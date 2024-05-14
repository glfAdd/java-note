package base.LFinal;

public class FinalTest {
    // 在声明的时候就需要赋值
    final static int a = 0;
    final int b1;

    public FinalTest(int b1) {
        this.b1 = b1;
    }

    public static void main(String[] args) {
        // 局部变量只声明没有初始化, 不会报错
        final int localA;
        //在使用之前一定要赋值
        localA = 1000;
        // 但是不允许第二次赋值
//        localA = 1;
        System.out.println(localA);


    }
}
