package OOP.advanced.stream.section3;

import java.util.Arrays;

// 카운팅, 총합, 평균, 최댓값, 최솟값, 첫번째 요소
public class AggregateEx {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        // 1. 카운팅
        Long cnt = Arrays.stream(array).count();
        System.out.println(cnt);
        System.out.println("---");
        // 2. 총합
        Integer tmpSum = Arrays.stream(array).sum();
        System.out.println(tmpSum);
        System.out.println("---");
        // 3. 평균
        Double avg = Arrays.stream(array).average().getAsDouble();
        System.out.println(avg);
        System.out.println("---");
        // 4. 최댓값
        Integer max = Arrays.stream(array).max().orElse(0);
        System.out.println(max);
        System.out.println("---");
        // 5. 최소값
        Integer min = Arrays.stream(array).min().orElse(0);
        System.out.println(min);
        System.out.println("---");
        // 6. 첫요소 추출
        Integer firstNum = Arrays.stream(array).findFirst().getAsInt();
        System.out.println(firstNum);
        System.out.println("---");
    }
}
