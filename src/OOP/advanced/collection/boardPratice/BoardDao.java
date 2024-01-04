package OOP.advanced.collection.boardPratice;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    private List<Board> list = new ArrayList<Board>();
    public List<Board> getBoardList(){
        List<Board> list = new ArrayList<Board>();
        // 5명이 글을 작성하였습니다. 5명이 쓴 글에 대해 boardList에 저장하세요.
        list.add(new Board("자바심화프로그래밍1","오늘은 컬렉션 프레임워크1", "YHS"));
        list.add(new Board("자바심화프로그래밍2","오늘은 컬렉션 프레임워크2", "YHS"));
        list.add(new Board("자바심화프로그래밍3","오늘은 컬렉션 프레임워크3", "YHS"));
        list.add(new Board("자바심화프로그래밍4","오늘은 컬렉션 프레임워크4", "YHS"));
        list.add(new Board("자바심화프로그래밍5","오늘은 컬렉션 프레임워크5", "YHS"));
        return list;
    }
    public void boardSize(List<Board> boardList){
        System.out.println("현재 게시글의 수는 "+ boardList.size() +"입니다.");
    }
    public void getBoardAll(){
        System.out.println("전체 보기");
        for (Board board : this.list){
            System.out.printf("글쓴이 : %s 제목 : %s, 내용 : %s\n",board.getWriter(),board.getSubject(),board.getContent());
            System.out.println("==========================================");
        }
    }
    public void writerSearch(String writer){
        for (Board board : list){
            if (board.getWriter().equals(writer))
                System.out.printf("글쓴이 : %s, 제목 : %s, 내용 : %s\n",board.getWriter(),board.getSubject(),board.getContent());
            else
                System.out.println("해당 글쓴이는 존재하지 않습니다.");
        }
    }
    public void boardInsert(String subject, String content, String writer){
//        boardList.add(new Board(subject, content, writer));
        Board board = new Board(subject, content, writer);
        list.add(board);
        getBoardAll();
    }
}
