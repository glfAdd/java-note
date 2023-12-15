package glfadd.service;

interface Person {
    String a = "a123";
    public String b = "b123";
    public static String c = "c123";

    public abstract void eat();
    public abstract void run();
    public default void look() {
        System.out.println("look");
    }
}

class Tom implements Person {
    @Override
    public void eat() {
    }

    @Override
    public void run() {
    }
}
