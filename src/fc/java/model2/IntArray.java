package fc.java.model2;

import java.util.Arrays;

public class IntArray { //배열처럼 동작하는 클래스
    private final int DEFAULT_CAPACITY=5;//final=절대로 이 값을 수정할 수 없음->상수
    private int[] elements;
    private int size=0;
    //생성동작
    public IntArray(){
        elements= new int[DEFAULT_CAPACITY];//5개 크기배열
    }
    //저장하는 동작
    public void add(int element){
        //크기체크? if
        if(size==elements.length){
            //크기를 2배로 늘리는 작업
            ensureCapacity();
        }
        elements[size++]=element;
    }


    // 얻는동작
    public int get(int index){//-1,5~
        //index체크? if
        return elements[index];
    }
    //원소의 개수를 넘겨주는 동작
    public int size(){
        return size;
    }
    private void ensureCapacity() {
        int newCapacity=elements.length*2;
        elements=Arrays.copyOf(elements,newCapacity);
    }
}
