package fc.java.course2.part1;

public class StringManipulation {
    public static void main(String[] args) {
        String str=new String("HelloWorld");
        System.out.println(str.charAt(0));
        System.out.println(str.replace("o", "x"));
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(5));

    }
}
