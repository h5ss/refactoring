package OOP.advanced.lambda.lambdaQuiz;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@FunctionalInterface
interface MathOperation_ {
    int calculate(int x, int y);
}

interface StringOperation_ {
    int getLength(String string);
}

interface ArrayOperation_ {
    int calculateSum(int[] numbers);
}

interface Calculator_ {
    int calculate(int x, int y);
}

public class LambdaQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 1번
        System.out.println("-1번-");
        int result1 = integers.stream().filter(n -> n % 2 == 0).reduce(1, (a, b) -> a + b);
        System.out.println(result1);

        // 2번
        System.out.println("-2번-");
        MathOperation_ addition = Integer::sum;
        int result2 = addition.calculate(5, 3);
        System.out.println(result2);


        // 3번
        System.out.println("-3번-");
//        String string = sc.nextLine();
        String string = "hihi";
        StringOperation_ stringOperation = strings -> string.length();
        int result3 = stringOperation.getLength(string);
        System.out.println(result3);


        // 4번
        System.out.println("-4번-");
        int[] tmpArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayOperation_ evenSumArray = numbers -> Arrays.stream(numbers)
                .filter(number -> number % 2 == 0).sum();
        int result4 = evenSumArray.calculateSum(tmpArray);
        System.out.println(result4);


        // 5번
        System.out.println("-5번-");
        int result5 = Arrays.stream(tmpArray).filter(number -> number % 2 == 0).sum();
        System.out.println(result5);

        // 6번
        System.out.println("-6번-");
        int[] tmpArray_2 = {1, 2, 3, 4, 5};
        int result6 = Arrays.stream(tmpArray_2).reduce(1, (a, b) -> a * b);
        System.out.println(result6);

        // 7번
        System.out.println("-7번-");
        double average = Arrays.stream(tmpArray_2).average().getAsDouble();
        System.out.println(average);

        // 8번
        System.out.println("-8번-");
        MathOperation_ addition_ = (a, b) -> a + b;
        int result8 = addition_.calculate(6, 8);
        System.out.println(result8);
//        int evenSum = integers.stream().
//                filter(num->num%2==0)
//                .mapToInt(Integer::intValue)
//                .sum();
//        System.out.println(evenSum);

        // 9번
        System.out.println("-9번-");
        Calculator_ plus = (a, b) -> a + b;
        int result9 = plus.calculate(2, 4);
        System.out.println(result9);

        // 10번
        System.out.println("-10번-");
        int evenOfSum = integers.stream().filter(n -> n % 2 == 0).reduce(0, (a, b) -> a + b);
        System.out.println(evenOfSum);
    }
}
