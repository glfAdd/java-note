package base.LSuper;

/**
 * 1. super 只能出现在构造方法和实例方法, 不能出现在静态方法中
 * 2. 通过子类的构造方法去调用父类的构造方法, 用来给当前子类的父类型特征初始化值, 能继承的部分
 * 3. 并没有在底层创建父类对象，只是给当前子类对象的父类型特征赋了值，实际上对象只有当前子类对象一个
 * 4. 子类的构造方法第一行必须是 super, 如果是其他的报错. 如果没有 super 也会默认有一个super
 * 5. 当子类属性与父类继承过来的属性或方法名字不一样时，super 关键字可以省略不写
 * 6. 当子类属性与父类继承过来的属性或方法名字一样时, 用 super 访问父类型的这部分特征
 */

public class Test1 {
    public static void main(String[] args) {
        System.out.println("------------------");
        Tom t = new Tom();
        System.out.println(t.age);
        System.out.println(t.name);
        System.out.println("------------------");
        Tom t2 = new Tom("Tom", 20);
        System.out.println(t2.age);
        System.out.println(t2.name);
        t2.name = "Lucy";
        System.out.println(t2.getPersonName());
        System.out.println(t2.getTomName());
    }
}

class Person {
    String name;
    Integer age;

    Person() {
        System.out.println("Person 无参数构造方法");
    }

    Person(String name, Integer age) {
        System.out.println("Person 有参数构造方法");
        this.name = name;
        this.age = age;
    }
}

class Tom extends Person {
    String name;
    Integer age;

    Tom() {
        super();
        System.out.println("Tom 无参数构造方法");
    }

    Tom(String name, Integer age) {
        super(name, age);
        System.out.println("Tom 有参数构造方法");
    }

    public String getPersonName() {
        // 如果父类和子类的属性相同, 使用 super. 调用父类属性
        return super.name;
    }

    public String getTomName() {
        return name;
    }
}