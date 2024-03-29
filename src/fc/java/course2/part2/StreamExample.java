package fc.java.course2.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Predicate<Integer> Jakcsu=n->n%2==0;//짝수 골라내기

        int sumOfJacksu=numbers.stream()
                .sorted()
                .filter(Jakcsu)
                .map(n->n*n)
                .reduce(0,Integer::sum);

        System.out.println(sumOfJacksu);

    }
}

