package fc.java.course2.part1;

import fc.java.model2.BB;
import fc.java.model2.CC;

//CC를 이용하여 BB를 동작시키는 프로그램(인터페이스 기반의 프로그램)
public class InterfaceAPI {
    public static void main(String[] args) {
        CC c=new BB();
        c.x();// BB의 x()가 동작 -> 동적바인딩
        c.y();
        c.z();
    }
}
