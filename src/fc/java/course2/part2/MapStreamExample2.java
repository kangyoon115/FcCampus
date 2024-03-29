package fc.java.course2.part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreamExample2 {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("apple","banana","cherry","orange");
        List<String> uppercase= words.stream()
                .map(word->word.toUpperCase())//대문자로 바꾸기
                .collect(Collectors.toList());//결과값을 list로 반환
        for(String str:uppercase){
            System.out.println(str);
        }
    }
}
