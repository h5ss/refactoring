package OOP.advanced.generic;
 // 모든 타입의 배열을 처리할 수 있는 제너릭 메서드
public class MyClass{

    public static <T> void printArray(T[] array){
        for (T element : array)
            System.out.println(element);
    }
}
