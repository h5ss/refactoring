package OOP.advanced.collection.boardPratice;

import java.util.List;

public class BoardMain {        //DAO
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> boardList = dao.getBoardList();

        //dao에 전체 게시물의 수를 제공하는 메소드 boardSize() 작성하여 전체 게시물의 수를 확인
        dao.boardSize(boardList);

        // Board의 전체 글을 조회
        //전체 글을 조회하는 메소드인 getBoardAll()
        // dao.getBoardAll(boardList);

        // dao 에 boardList에 글쓴 사람의 이름을 전달하여 해당 글쓴이를 확인한 후 있다면 글쓴니의 이름과 글 주제, 내용을 출력하는
        // writerSearch() 메소드를 작성하세요
        Board two = boardList.get(1);
        System.out.println(two.getWriter());
        two.setWriter("KJS");
        System.out.println(two.getWriter());

        dao.writerSearch("YHS");

        // dao에 boardInsert(String subject, String writer, String content)
        // 메소드를 작성하여 새로운 글이 추가기능 구현 하세요
        dao.boardInsert("자바심화","컬렉션~","윤호상");

    }
}
