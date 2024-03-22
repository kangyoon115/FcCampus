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
    private static void display(A a) {
        a.printGo();
    }
    private static void display(B b) {
        b.printGo();
    }
}
