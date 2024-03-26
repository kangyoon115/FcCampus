package fc.java.course2.part1;

import fc.java.model2.ObjectArray;
import fc.java.model2.*;

public class MyObjectArrayTest {
    public static void main(String[] args) {
        //A,B,C객체를 배열 Object[]에 저장하고 출력하세요
        //Book, Movie,Member 객체를 배열에 저장하고 출력하세요
        ObjectArray list= new ObjectArray();
        list.add(new A());// Upcasting
        list.add(new B());
        list.add(new C());

        A a =(A)list.get(0);// A<=Object, Downcasting
        a.display();
        B b =(B)list.get(1);
        b.display();
        C c =(C)list.get(2);
        c.display();

        for(int i=0;i< list.size();i++){
            if(list.get(i) instanceof A){
                ((A)list.get(i)).display();
            } else if (list.get(i) instanceof B) {
                ((B)list.get(i)).display();
            } else {
                ((C)list.get(i)).display();
            }
        }
    }

}
