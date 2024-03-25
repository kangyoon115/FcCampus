package fcjava.course2.part1;

import com.google.gson.Gson;
import fcjava.model2.Person;

public class GsonToAPI {
    public static void main(String[] args) {
        Person person=new Person("John", 30);
        Gson gson = new Gson();
        String json=gson.toJson(person);
        System.out.println(json); // Json: {"name":"John","age":30}
    }
}
