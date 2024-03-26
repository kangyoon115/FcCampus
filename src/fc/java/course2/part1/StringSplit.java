package fc.java.course2.part1;

public class StringSplit {
    public static void main(String[] args) {
        String str="Hello,World,Java";
        String[] strArray=str.split(",");
        for(String s: strArray){
            System.out.println(s.toString());
        }
    }
}
