package OOP.advanced.generic;
// MyClass2 클래스에서 배열과 두개의 인덱스를 받아 주어진 인덱스에서 요소를 교환하는
// static void swap 제너릭 메서드를 구현하세요
// swap 메서드는 모든 타입의 배열을 처리할 수 있어야 한다.
public class MyGenericClass2 {

    public static <T> void swap(T[] array, int index1, int index2){
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        System.out.println("===Before swap===");
        for (Integer number : intArray)
            System.out.println(number);
        System.out.println("===After swap===");
        swap(intArray, 1,3);
        for (Integer number : intArray)
            System.out.println(number);
    }
}
