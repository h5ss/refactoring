package OOP.advanced.lambda.lambdaEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// JAVA8 제공 : 생성자 참조는 객체를 인스턴스화 하지 않고도 생성자를 참조할 수 있는 방법 제공한다.
public class LambdaConstructorEx {
    public static void main(String[] args) {
        // 1. 인수가 없는 생성자 참조 (Supplier 함수형 인터페이스는 인수가 없는 객체의 공급자를 나타낸다.)
        // 참조된 생성자를 사용하여 새 객체를 생성하는 방법 제공한다.
        // Supplier<ClassName> constructorRef = ClassName::new;

        // 2. 인수가 있는 생성자 참조
        // Function<Integer,ClassName> constructorRef = ClassName::new;

        // 3.배열 생성자에 대한 참조
        // Function<Integer, ClassName[]> constructorRef = ClassName[]::new;

        // 4.제너릭 클래스의 생성자 참조
        // Supplier<GenericClass<Integer>> constructorRef = GenericClass<Integer>::new;

//        Calculator calculator = new Calculator();
//        Calculator calculator = Calculator::new;
        // 미리 정의된 값으로 컬렉션을 초기화 .
        List<Integer> numbers = Stream.of(1,2,3,4,5).collect(Collectors.toCollection(ArrayList::new));

//        Function<String,Integer, Person> personFunction = Person::new;
//        Person john = personFunction.apply("John",20);

        // 1. 인수가 없는 String 생성자를 사용하여 새 String 객체를 생성
        Supplier<String> newString = String::new;
        String emptyString = newString.get();   // get 메소드를 이용허여 인수가 없는 String 생성자 호출 새로운 빈 String 객체반환
        System.out.println(emptyString);

        // 2. 인수가 없는 ArrayList 생성자를 사용하여 새 ArrayList 객체를 생성하는 람다식 작성
        Supplier<ArrayList<String>> newArrayList = ArrayList::new;
        ArrayList<String> emptyList = newArrayList.get();
        System.out.println(emptyList);

        // 3. 인수가 없는 Random 생성자를 사용하여 새 Random 객체를 생성하는 람다식 작성
        Supplier<Random> newRandom = Random::new;
        Random random = newRandom.get();
        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);
    }
}
