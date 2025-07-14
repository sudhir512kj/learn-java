package abstractClasses;

abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Pig extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    public void eat() {
        System.out.println("Pig is eating");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Pig p1 = new Pig();
        p1.animalSound();
        p1.sleep();

        Animal a1 = new Pig();
        a1.animalSound();
        a1.sleep();
    }
}
