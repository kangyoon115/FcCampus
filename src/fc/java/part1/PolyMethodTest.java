package fc.java.part1;

import fc.java.poly.Dog;
import fc.java.poly.Animal;
import fc.java.poly.Cat;

public class PolyMethodTest {
    public static void main(String[]args){
        Dog d=new Dog();
        display(d);
        Cat c=new Cat();
        display(c);
    }

    private static void display(Animal ani) {//다형성인수
        ani.eat();
        //Cat타입으로 받은 경우에만 실행
        if(ani instanceof Cat){ //instanceof:타입확인연산자
            ((Cat)ani).night();
        }

    }

}
