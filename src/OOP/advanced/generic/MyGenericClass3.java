package OOP.advanced.generic;
// MyGenericClass3 배열과 요소를 받아 배열 내에서
// 해당 요소의 발생 횟수를 반환하는 countOccurrences 제너릭 메서드를 구현하세요.
public class MyGenericClass3 {
    public static <T> int countOccurrences(T[] array, T items){
        int count = 0;
        for (T item : array){
            if (item.equals(items))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String[] strArray = {"apple","banana","apple","orange","apple"};
        String target = "apple";
        int occurrences = countOccurrences(strArray,target);
        System.out.println(target + " : " + occurrences);
    }
}
