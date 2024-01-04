package OOP.advanced.collection.app;

import java.util.*;

public class TreeMapEx {

    // TreeSet에 무작위로 점수를 입력하고 검색하는 방법
    public static void main(String[] args) {
        TreeMap<String,Integer> scores = new TreeMap<>();
        // 이름(String, 점수 Integer) 저장
        scores.put("sam",75);
        scores.put("Tom",80);
        scores.put("sara",87);
        scores.put("sin",70);
        scores.put("adward",65);
        scores.put("kim",50);
        scores.put("kate",90);
        scores.put("billy",95);

        // 점수를 for each를 이용하여 scores의 학생의 이름과 점수들을 출력
        TreeSet<Integer> scoresTree = new TreeSet<>(scores.values());
        for (Integer i : scoresTree)
            System.out.println(i);
        System.out.println("--------------");

        // 특정 점수를 가져오기
        System.out.println(scoresTree.floor(70));
        System.out.println("--------------");
        // 가장 낮은 점수 출력
        System.out.println(scoresTree.first());
        System.out.println("--------------");
        // 가장 높은 점수 출력
        System.out.println(scoresTree.last());
        System.out.println("--------------");
        // 90점 이하 점수
        System.out.println(scoresTree.lower(90));
        System.out.println("--------------");
        // 90점 이상 점수
        System.out.println(scoresTree.higher(90));
        System.out.println("--------------");
        // 90점이거나 바로 아래 점수
        System.out.println(scoresTree.floor(90));
        System.out.println("--------------");
        // 80점이거나 바로 위의 점수
        System.out.println(scoresTree.ceiling(90));
        System.out.println("--------------");
        // 내림차순 정렬하기
        NavigableSet<Integer> descendingScores = scoresTree.descendingSet();
        for (Integer s: descendingScores)
            System.out.println(s+" ");
        System.out.println("--------------");


        // 범위 검색(key : 이름이 b~k 학생의 이름과 점수 출력하라)

        // 범위 검색 (80<= scores <90의 학생의 이름과 점수를 출력하라)

    }
}
