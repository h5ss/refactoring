package OOP.advanced.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMain {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        boolean check = false;

        check = set.add("신세계 자바 과정1");
        System.out.println(check);
        check = set.add("신세계 자바 과정2");
        System.out.println(check);
        check = set.add("신세계 자바 과정3");
        System.out.println(check);
        check = set.add("신세계 자바 과정3");
        System.out.println(check);

        int size = set.size();
        System.out.println(size);

        Set<Member> members = new HashSet<Member>();

        members.add(new Member("최문석",34));
        members.add(new Member("윤여빈",21));
        members.add(new Member("윤여빈",21));

        System.out.println(members.size());

        // 객체를 하나씩 가져와서 처리
        Iterator<Member> iterator = members.iterator();

        while (iterator.hasNext()){
            Member member = iterator.next();
            System.out.println(member.age + " " + member.name);
            if(member.name.equals("최문석")){
                iterator.remove();
            }
        }
        for (Member member : members){
            System.out.println(member.age + " " + member.name);
        }
    }
}