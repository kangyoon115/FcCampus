package part1;

import poly.Animal;
import poly.Cat;
import poly.Dog;

public class ObjectCasting {
    public static void main(String[] args) {
        // Animal-> Dog,Cat 상속
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat(); //업케스팅
        ani.eat();
        //Cat c=(Cat)ani;//다운케스팅:night는 개에 없고 고양에이만 있는 상황
        //c.night();
        ((Cat)ani).night(); //로도 가능
    }
}
