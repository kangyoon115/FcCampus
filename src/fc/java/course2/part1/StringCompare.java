package fc.java.course2.part1;

public class StringCompare {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="World";

        if(str1.equals(str2)){
            System.out.println("두 문자열은 같다");
        }else{
            System.out.println("두 문자열은 다르다");
        }

        int result=str1.compareTo(str2);

        if(result==0){
            System.out.println("두 문자열은 같다");
        } else if (result<0) {
            System.out.println("str1이 str2보다 앞에 있습니다.");
        } else{
            System.out.println("str2가 str1보다 앞에 있습니다.");
        }
    }
}
