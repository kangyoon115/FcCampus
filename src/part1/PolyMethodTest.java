package part1;

import fcjava.model.Cat;
import fcjava.model.Dog;

public class PolyMethodTest {
    public static void main(String[]args){
        Dog d=new Dog();
        display(d);
        Cat c=new Cat();
        display(c);
    }

    private static void display(Cat c) {
        c.eat();
    }

    private static void display(Dog d){
        d.eat();
    }

}
