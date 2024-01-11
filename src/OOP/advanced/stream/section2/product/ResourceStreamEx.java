package OOP.advanced.stream.section2.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ResourceStreamEx {
    public static void main(String[] args) {
        // 1. 외부 반복자 fori 를 이용하여 Product 를 생성할 때 제품번호 => i, 상품명 => "상풍명" + i , "shinsegae", 가격 random() 메소드로 만원 넘지 않도록 책정
        // 10개 생성하여 리스트커렉션 productList 에 저장
        List<Product> productList = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            productList.add(new Product(i,"그릇"+i,"shinsegae", random.nextInt(10000)));
        }
        // 2. 객체 스트림을 통하여 productList 의 상품 정보를 출력
        productList.stream().forEach(System.out::println);
    }
}
