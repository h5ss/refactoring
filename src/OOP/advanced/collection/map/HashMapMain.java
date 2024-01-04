package OOP.advanced.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMain {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
       // Map map2 = new HashMap(); // 모든 타입의 객체의 키와 값을 저장, 거의 없다.

        // 이름을 Key, 점수를 Value 저장하는 map 구현
        scores.put("김지영",100);
        scores.put("김하나",90);
        scores.put("이지은",80);
        scores.put("김진석",80);
        scores.put("김진석",80);

        System.out.println("총 Entry 수 "+ scores.size());
        System.out.println();

        String key = "김진석";
        Integer value = scores.get(key);
        System.out.println(key + " 학생의 점수는 "+value);
        System.out.println();

        // 키 Set 컬렉션을 얻어와, 반복자를 통해 키와 값을 출력하기
        Set<String> keySet = scores.keySet();
        Iterator<String> keyIterator = keySet.iterator();

        while(keyIterator.hasNext()){
            String k = keyIterator.next();
            Integer v = scores.get(k);
            System.out.println(k + " : " + v);
        }

        // 엔트리 Set 컬렉션을 얻어, 반복하여 키와 값을 출력하기
        Set<Map.Entry<String, Integer>> entrySet = scores.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()){
            Map.Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
        }

        System.out.println();
        System.out.println("변경전 " +scores.size());
        scores.remove("김하나");
        System.out.println("변경후 " +scores.size());

        scores.clear();
        System.out.println("변경후 "+scores.size());

    }
}
