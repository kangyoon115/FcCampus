package part1;

import Poly.Animal;
import Poly.Cat;
import Poly.Dog;

public class OverrideTest {
    public static void main(String[]args){
        //업케스팅
        Animal ani=new Dog();// Animal 동적바인딩->Dog
        ani.eat(); //동물처럼 먹다-> 개처럼 먹다

        ani=new Cat();
        ani.eat(); //동물처럼 먹다-> 고양이처럼 먹다
    }

}
