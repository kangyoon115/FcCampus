package fcjava.part1;

import fcjava.poly.A;

public class ObjectTest {
    public static void main(String[] args) {
        //A객체를 Upcasting으로 생성하세요
        A a= new A();
        a.display();
        Object ob=new A();//Upcasting
        ((A)ob).display();//Downcasting
    }

}
