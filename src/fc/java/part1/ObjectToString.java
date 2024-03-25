package fc.java.part1;

import fc.java.poly.Board;

public class ObjectToString {
    public static void main(String[] args) {
        Board b=new Board();
        b.setTitle("게시글입니다.");
        //System.out.println(b.getTitle());
        System.out.println(b.toString());//toString은 부모의 Object거임으로 그 메모리가 어디에 저장되어있는지 번지를 출력
        System.out.println(b);//toString생략 ->번지 대신에 게시글이 나왔으면 함

    }
}
