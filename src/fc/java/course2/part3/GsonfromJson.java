package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.model3.Member;

public class GsonfromJson {
    public static void main(String[] args) {
        String json="{\"name\":\"홍길동\",\"age\":30,\"email\":\"kang01105@naver.com\"}";
        //JSON-> Object(Member)
        Gson gson=new Gson();
        Member mvo=gson.fromJson(json, Member.class);
        System.out.println("mvo="+mvo);//mvo.toString()
    }
}
