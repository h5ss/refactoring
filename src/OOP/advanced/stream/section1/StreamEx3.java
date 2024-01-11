package OOP.advanced.stream.section1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamEx3 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 4};
        List<Integer> list = new ArrayList<>();

        // 컬렉션 이용한 방식
        // 1-1. forEach를 이용해서 array의 숫자를 list에 추가하되 홀수만 추가
        for (int i : array) {
            if (i % 2 == 1)
                list.add(i);
        }
        // 1-2. list 를 오름차순 정렬
        Collections.sort(list);
        // 1-3. forEach 를 이용하여 list 요소 출력
        for (int i : list)
            System.out.println(i);

        System.out.println("---");
        // 2.Stream 이용한 방식
        Arrays.stream(array).filter(n -> n % 2 == 1).sorted().forEach(System.out::println);
    }
}
