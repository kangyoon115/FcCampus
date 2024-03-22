package fcjava.part1;

import fcjava.poly.Animal;
import fcjava.poly.Cat;
import fcjava.poly.Dog;

public class OverrideTest {
    public static void main(String[]args){
        //업케스팅
        Animal ani=new Dog();// Animal 동적바인딩->Dog
        ani.eat(); //동물처럼 먹다-> 개처럼 먹다

        ani=new Cat();
        ani.eat(); //동물처럼 먹다-> 고양이처럼 먹다
    }

}