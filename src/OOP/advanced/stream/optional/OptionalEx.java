package OOP.advanced.stream.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        OptionalDouble optionalDouble = list.stream()
                .mapToInt(Integer::intValue).average();

        // Optional 방법 1

        if (optionalDouble.isPresent()){
            System.out.println("평균 : "+optionalDouble.getAsDouble());
        }else {
            System.out.println("평균 : "+0.0);
        }

        // Optional 방법 2

        double avg = list.stream()
                .mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println(avg);

        // Optional 방법 3

        list.stream().mapToInt(Integer::intValue)
                .average().ifPresent(average-> System.out.println("방법 3 avg : "+average));
    }
}
