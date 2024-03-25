package fc.java.model;

public class Dog extends Animal {
    //아래의 super는 생략해도 됨
    public Dog(){
        super();
    }
    //재정의
    public void eat(){
        System.out.println("개처럼 먹다");
    }
}
