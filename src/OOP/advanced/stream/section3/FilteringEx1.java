package OOP.advanced.stream.section3;

import java.util.ArrayList;
import java.util.List;

public class FilteringEx1 {
    public static void main(String[] args) {
        // 1. List<String> 컬렉션 ArrayList nameList 생성하세요
        List<String> nameList = new ArrayList<>();
        // List<String> nameList = List.of("qq","qq","pp","pp");

        // 2. nameList 에 이름을 추가해 주세요. 같은 이름을 두 번 넣어주세요.
        nameList.add("윤호상");
        nameList.add("윤호상");
        nameList.add("윤호호");
        nameList.add("윤호호");
        nameList.add("윤상상");
        nameList.add("윤상상");
        nameList.add("윤윤윤");
        nameList.add("윤윤윤");
        nameList.add("정가람");
        nameList.add("정수영");

        // 3. 중복 요소 제거
        nameList.stream().distinct().forEach(System.out::println);
        System.out.println("---");

        // 4. "정"으로 시작하는 요소만 필터링해서 출력
        nameList.stream().filter(name->name.startsWith("정")).forEach(System.out::println);
        System.out.println("---");

        // 5. 중복요소를 제거하고, "정"으로 시작하는 요소만 필터링 하여 lastNameList 로 저장하세요
        List<String> lastNameList = nameList.stream().distinct().filter(name->name.startsWith("정")).toList();
        // 6. lastNameList 를 출력
        System.out.println(lastNameList);
        lastNameList.stream().forEach(System.out::println);

    }
}
