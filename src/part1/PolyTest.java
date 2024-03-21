package part1;

import Poly.Animal;
import Poly.Dog;
import Poly.Cat;

public class PolyTest {
    public static void main(String[] args) {
        //Upcasting으로 객체를 생성
        //상속관계, 재정의(Override), 동적바인딩
        //다형성
        //상위클래스가 동일한 메세지를 보내면 하위클래스를 서로 다르게 동작시키는 객체지향
        Animal ani = new Dog();
        ani.eat();

        //Donwcasting 다운케스팅
        ani= new Cat();
        ani.eat();
        ((Cat)ani).night();
        //Overloading 정적바인딩=컴파일시점에서 사용된 메서드가 결정되는 바인딩


    }

}
