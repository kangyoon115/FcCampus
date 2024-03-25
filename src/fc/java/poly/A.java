package fc.java.poly;
import java.lang.*;

//최상위 클래스 Objcet 실습
public class A extends Object {
    public A(){
        super();// new Object() 부모부터 객체 생성
    }
    public void display(){
        System.out.println("나는 A입니다.");
    }
    public void printGo(){
        System.out.println("나는 A이다");
    }
}
