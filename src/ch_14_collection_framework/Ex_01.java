package ch_14_collection_framework;

import java.util.ArrayList;
import java.util.List;

// BoardDao 객체의 getBoardList() 메서드를 호출하면 List<Board> 타입의 컬렉션을 리턴
// main() 메서드 실행 시 아래와 같이 출력될 수 있도록 BoardDao의 getBoardList() 메서드를 작성

class Board {
	private String title;
	private String content;
	
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}

}

class BoardDao {
	public List<Board> getBoardList() {
		List<Board> boardList = new ArrayList<Board>();
		
		boardList.add(new Board("제목1","내용1"));
		boardList.add(new Board("제목2","내용2"));
		boardList.add(new Board("제목3","내용3"));
		return boardList;
	}
	
}

 /* 다른 방법 */
//class BoardDao {
//	List<Board> boardList = new ArrayList<Board>();
//	
//	public BoardDao() {
//		boardList.add(new Board("제목1", "내용1"));
//		boardList.add(new Board("제목2", "내용2"));
//		boardList.add(new Board("제목3", "내용3"));
//	}
//	
//	public List<Board> getBoardList() {
//		return boardList;
//	}
//}

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for (Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
		/*
		 제목1 - 내용1
		 제목2 - 내용2
		 제목3 - 내용3
		 */

	}

}
