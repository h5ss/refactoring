package OOP.advanced.stream.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionEx {
    public static void main(String[] args) {
        List<Member> memberList = Arrays.asList(
                new Member(1, "홍길동", "M"),
                new Member(2, "홍삼동", "F"),
                new Member(3, "김길동", "M"),
                new Member(4, "김견희", "F"),
                new Member(5, "윤셩렬", "M"));

        // 남자회원만 "M" 묶어서 따로 menList 에 저장하고 출력

        List<Member> menList1 = memberList.stream()
                .filter(member -> member.getGender().equals("M"))
                .toList();

        List<Member> menList2 = memberList.stream()
                .filter(member -> member.getGender().equals("M"))
                .collect(Collectors.toList());
        System.out.println(menList1 + ":" + menList2);

        // 회원정보 리스트에서 이름만 추출하여 출력하세요.
        memberList.stream().map(Member::getName).forEach(System.out::println);
        System.out.println("---");

        // 회원의 회원번호를 키로 회원이름을 값으로 하여 Map 생성하고 출력하세요.
        memberList.stream()
                .map(member -> member.getNo() + " : " + member.getName())
                .forEach(System.out::println);
        System.out.println("---");

        Map<Integer, String> map = memberList.stream()
                .collect(Collectors.toMap(Member::getNo, Member::getName));
        System.out.println(map);

        // "M" "F" 키로 설정하여 List<Member>를 값으로 갖는 Map 을 생성하세요.
        Map<String,List<Member>>  genderGroupMap =
                memberList.stream().collect(Collectors.groupingBy(Member::getGender));

        System.out.println("====남성 회원 리스트====");
        List<Member> maleMemberList = genderGroupMap.get("M");
        maleMemberList.forEach(member -> System.out.println(member.getName()));

        System.out.println("====여성 회원 리스트====");
        List<Member> femaleMemberList = genderGroupMap.get("F");
        femaleMemberList.forEach(member -> System.out.println(member.getName()));
    }
}
