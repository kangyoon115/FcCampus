package part1;

import poly.Animal;
import poly.Cat;
import poly.Dog;

public class DogCatUpcastingTest {
    public static void main(String[] args)
    {
        //Dog 객체를 사용해보자
        //Upcasting(업케스팅)
        //부모가 자식을 가리킨다.
        Animal ani = new Dog();
        ani.eat(); // 동물처럼 먹다 -> 개처럼 먹다

        ani = new Cat();
        ani.eat(); // 동물처럼 먹다 -> 고양이처럼 먹다

    }
}
