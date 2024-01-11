package OOP.advanced.stream.section2.product;

import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 배열로부터 스트림 얻기 : java.util.Arrays 클래스를 이용하면 다양한 종류의 배열로부터 스트림을 얻어 낼 수 있다.
public class ArrayStreamEx {
    public static int total1;
    public static int total2;

    public static void main(String[] args) throws Exception {
        // 1.
        String[] strings = {"초코파이", "몽쉘통통", "빅파이"};
        // strings 스트림 객체를 얻어, strings 의 객체 값을 출력
        Arrays.stream(strings).forEach(System.out::println);

        // 2. Integer 스트림 객체 얻기
        int[] scores = {90, 80, 77, 80, 65, 98};
        System.out.println("----");
        // scores 스트림 객체를 얻어, scores 의 각 요소 값의 총합과 평균과 해당 요소의 개수를 출력
        System.out.println("총합 : " + Arrays.stream(scores).reduce(Integer::sum).getAsInt());
        System.out.println("평균  : " + Arrays.stream(scores).average().orElse(0));
        System.out.println("배열의 개수 : " + Arrays.stream(scores).count());

        // 3. 특정 범위의 숫자 스트림 얻기 (IntStream 또는 LongStream 의 정적 메서드 range(), rangeClosed())
        IntStream stream = IntStream.range(1, 100);
        IntStream stream1 = IntStream.rangeClosed(1, 100);
        stream.forEach(number -> total1 += number);
        System.out.println("총합 : "+ total1);
        stream1.forEach(number -> total2 += number);
        System.out.println("총합 : "+ total2);

        int row = 3;
        int column = 5;
        IntStream.range(0,row)
                .forEach(n->{
                    IntStream.range(0,column).forEach(s-> System.out.print("*"));
                    System.out.println();
                });



        // 4. 파일로부터 스트림 얻기
        // java.nio.file.Files 의 lines() 이용하면, 텍스트 파일의 행 단위 스트림을 얻을 수 있다.

        Path path = Paths.get(ResourceStreamEx.class.getResource("productlist.txt").toURI());
        Stream<String> filesStream = Files.lines(path, Charset.defaultCharset());
        filesStream.forEach(System.out::println);
        filesStream.close();
    }
}
