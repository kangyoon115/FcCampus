package fc.java.course2.part1;

import java.util.ArrayList;

public class CollectionBasic {
    public static void main(String[] args) {
        // ArrayList에 10,20,304,50,60 5개의 정수를 저장하고 출력
        // ArrayList -> Object[] <-----X-----int
        // ArrayList -> Object[] <-----X-----integer(Wrapper)
        // ArrayList -> Object[] <--(Auto boxing:Integer)--int
        ArrayList<Integer> list= new ArrayList<>();
        list.add(10); //new Integer(10) Auto-boxing
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        for(int data:list){
            System.out.println(data);
        }
    }

}
