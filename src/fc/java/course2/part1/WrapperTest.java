package fc.java.course2.part1;

public class WrapperTest {
    public static void main(String[] args) {
        //정수형 변수에 10을 저장하세요
        int a =10;
        Integer aa=10;//사용자정의 자료형
        System.out.println(aa.intValue()); //Unboxing(Integer->int)

        Integer bb = 20; //Auto-boxing
        int b=bb; //Auto-Unboxing
        System.out.println(b);

        float f=1.4f;
        Float ff = 45.6f;
        System.out.println(ff.floatValue());
    }
}
