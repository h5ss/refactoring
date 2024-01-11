package OOP.advanced.lambda.lambdaEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@FunctionalInterface
interface MathOperation{
    int calculate (int a, int b);
}
interface StringOperation{
    int getLength(String string);
}
interface ArrayOperation{
    int calculateSum (int[] numbers);
}
// 정수 리스트를 받아 최대값을 반환하는 람다식을 작성
interface FindMax{
    int getMax(List<Integer> numbers);
}
public class LambdaEx2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        MathOperation addition = (a,b) -> a+b;
        int result = addition.calculate(5,3);
        System.out.println("Result : "+result);

        //문자열의 길이를 반환하는 람다식 작성
        StringOperation getStr = string -> string.length();
        // 람다식에 데이터를 전달한 후 반환 처리 구문 작성
        int length = getStr.getLength("HelloWorld");

        System.out.println("문자열 길이 : "+length);
        System.out.println("---------");

        int[] array = {1,2,3};
        ArrayOperation sumArray = num -> Arrays.stream(num)
                .filter(number -> number % 2 ==1).sum();
        int sum = sumArray.calculateSum(array);

        System.out.println("홀수의 합  : "+sum);

//        List<Integer> values = Arrays.asList(1,434,456,2,4,16,123,7,13,66);
        FindMax max = numbers -> {
            int maxNumber = Integer.MIN_VALUE;
            for (int number : numbers) {
                if (number > maxNumber)
                    maxNumber = number;
            }
            return maxNumber;
        };

        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numberList.add(sc.nextInt());
        }

        int maxValue = max.getMax(numberList);
        System.out.println("Max value :" + maxValue);
    }
}
