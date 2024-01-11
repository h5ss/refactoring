package OOP.advanced.generic;

import java.util.ArrayList;
import java.util.List;

// 모든 타입의 객체를 담을 수 있는 Box 라는 제러닐 클래스를 생성하세요.
// 객체는 items 라는 ArrayList 에 저장됩니다.
// 상자에 (Box) 객체를 추가(addItem())하고, 상자에서 객체를 검색(getItem()리스트에서 첫번째 항목 검색)하고,
// 상자가 비어 있는지 확인하는 메서드(isEmpty())를 구현
public class Box <T>{
    private List<T> items;

    public Box() {
        items = new ArrayList<>();
    }

    public T getItems() {
        if (!items.isEmpty())
            return items.get(0);
        return null;
    }

    public void addItems(T t){
        items.add(t);
    }
    public boolean isEmpty(){
        return items.isEmpty();
    }
}
