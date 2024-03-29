package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.model3.Member;

public class GsontoJson {
    public static void main(String[] args) {
        Member mvo=new Member("홍길동",30,"kang01105@naver.com");
        //객체생성
        Gson gson=new Gson();
        //Object->JSON
        String json=gson.toJson(mvo); //mvo라는 객체를 JSON으로 변환시켜서 json에 저장
        System.out.println("json="+json); //json={"name":"홍길동","age":30,"email":"kang01105@naver.com"}

    }
}
