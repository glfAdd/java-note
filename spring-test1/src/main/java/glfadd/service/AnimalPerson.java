package glfadd.service;


abstract class Test1 {
    public String a = "aa";
    public String b = "bb";

    public void eat1() {
        System.out.printf("Test1 - %s - %s\n", a, b);
    }
}

interface Test2 {
    public String c = "cc";

    public void eat2();
}


class Test3 extends Test1 implements Test2 {
    @Override
    public void eat1() {
        super.eat1();
        System.out.printf("Test3 - eat2 - %s - %s\n", a, b);
    }

    @Override
    public void eat2() {
        System.out.printf("Test1 - eat2 - %s - %s\n", a, b);
    }
}

public class AnimalPerson {
    public static void main(String[] args) {
        Test3 t = new Test3();
        t.eat1();
        t.eat2();
    }
}
