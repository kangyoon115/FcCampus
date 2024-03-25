package fc.java.poly;

public class Board extends Object {//toString():문자열을 번지로 출력
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //Override재정의
//    public String toString(){
//        return title; //문자열
//    }
    @Override
    public String toString() {
        System.out.println(super.toString()); //상위 클래스의 메서드 호출,부모의 toString호출
        return "Board{" +
                "title='" + title + '\'' +
                '}';
    }

}
