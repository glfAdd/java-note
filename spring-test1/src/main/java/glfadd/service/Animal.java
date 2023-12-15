package glfadd.service;

abstract public class Animal {
    public String name;
    public Integer age;
    public final Boolean isLive = true;

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
        String a = String.format("animal - init - %s - %d%n", name, age);
        System.out.println(a);
    }

    public void eat() {
        System.out.printf("animal - ear - %s - %d%n", name, age);
    }

    public abstract void run();
}


class AnimalCat extends Animal {
    public AnimalCat(String name, Integer age) {
        super(name, age);
        System.out.printf("cat - init - %s - %d%n", name, age);
    }

    @Override
    public void run() {
        System.out.printf("cat - run - %s - %d%n", name, age);
    }
}

class AnimalDog extends Animal {
    public AnimalDog(String name, Integer age) {
        super(name, age);
        System.out.printf("dog - init - %s - %d%n", name, age);
    }

    @Override
    public void run() {
        System.out.printf("dog - run - %s - %d%n", name, age);
    }
}

class AnimalTest {
    public static void main(String[] args) {
        AnimalCat c = new AnimalCat("Tom", 12);
        c.eat();
        c.run();
        AnimalDog d = new AnimalDog("Jack", 20);
        d.eat();
        d.run();
    }
}
