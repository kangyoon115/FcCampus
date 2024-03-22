package fcjava.part1;
import fcjava.poly.A;
import fcjava.poly.B;



public class ObjectPolyTest {
    public static void main(String[] args) {
        A a = new A();
        display(a);
        B b = new B();
        display(b);
    }
    private static void display(Object ob) {
        if (ob instanceof A) {
            ((A) ob).printGo();
        } else {
            ((B) ob).printGo();
        }
    }

}
