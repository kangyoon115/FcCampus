package poly;

public class Dog extends Animal { //Animal -> eat(); 추상메서드
    //재정의 하지 않음 --> 오류입니다(재정의 하세요)
    //재정의를 반드시 해야한다.
    public void eat(){
        System.out.println("개처럼 먹다");
    }
}
