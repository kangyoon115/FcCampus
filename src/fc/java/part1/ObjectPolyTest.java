package fc.java.part1;
import fc.java.poly.A;
import fc.java.poly.B;



public class ObjectPolyTest {
    public static void main(String[] args) {
        A a = new A();
        display(a);
        B b = new B();
        display(b);
    }
    private static void display(Object ob) { //다형성인수 활용
        if (ob instanceof A) {
            ((A) ob).printGo();
        } else {
            ((B) ob).printGo();
        }
    }

}
