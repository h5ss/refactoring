package 내가만든프로젝트;

import java.util.ArrayList;

public class BookService {
    private ArrayList<Book> bookMall = new ArrayList<>();
    Book book1 = new Book("ISBN1234", "쉽게 배우는 JSP 웹 프로그래밍", 27000, "송미영", "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍", "IT전문서", "2018/10/06");
    Book book2 = new Book("ISBN1235", "안드로이드 프로그래밍", 33000, "우재남", "실습 단계별 명쾌한 멘토링!", "IT전문서", "2022/01/22");
    Book book3 = new Book("ISBN1236", "스크래치", 22000, "고광일", "컴퓨터 사고력 키우는 블록 코딩", "컴퓨터입문", "2019/06/10");

    private void addBookMall(){
        bookMall.add(book1);
        bookMall.add(book2);
        bookMall.add(book3);
    }
    public void printBookMallList(){
        for (Book book : bookMall)
            book.bookPrint();
    }
}
