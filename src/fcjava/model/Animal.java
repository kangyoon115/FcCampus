package fcjava.model;

public class Animal extends Object {
    public Animal() {
        super(); // new Object
    }

    public void eat() {
        System.out.println("동물처럼 먹다");//추상적인 표현
    }
}
