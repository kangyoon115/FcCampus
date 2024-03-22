package fcjava.part1;

import fcjava.poly.A;
import fcjava.poly.B;

public class ObjectPolyArray {
    public static void main(String[] args) {
        // A,B 클래스를 저장할 배열을 생성하시오.
        //다형성 배열
        Object[] ob=new Object[2];
        ob[0]=new A();//업캐스팅
        //((A)ob[0]).printGo();
        ob[1]=new B();//업캐스팅
        //((B)ob[0]).printGo();
        display(ob);
        /*
        for(int i=0;i<ob.length;i++){
            if(ob[i] instanceof A) {
                ((A) ob[i]).printGo();
            }else {
                ((B) ob[i]).printGo();
            }
        }
        */

    }

    private static void display(Object[] ob) {
        for(int i=0;i<ob.length;i++){
            if(ob[i] instanceof A) {
                ((A) ob[i]).printGo();
            }else {
                ((B) ob[i]).printGo();
            }
        }
    }

}
