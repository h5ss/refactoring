package OOP.advanced.generic.wildcard;

import java.util.ArrayList;
import java.util.List;

// 모든 타입의 ArrayList 를 출력할 수 있는 printList 라는 메서드를 작성하세요.
public class ArrayListEx{
    /*public static void printList(List<?> list){
        list.forEach(System.out::println);
    }*/
    public static <T extends Comparable<T>> void printList(List<?> list){
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        List<String> stringList = new ArrayList<>(List.of("lee","kim","jin"));
        printList(numberList);
        printList(stringList);

        // board 게시글을 저장한 리스트를 만들어 해당 글 내용(content)을 출력하도록


        Board board1 = new Board("제목1","내용1","작성자1");
        Board board2 = new Board("제목2","내용2","작성자2");
        Board board3 = new Board("제목3","내용3","작성자3");
        List<Board> boardList = new ArrayList<>(List.of(board1,board2,board3));
        printList(boardList);

    }
}
