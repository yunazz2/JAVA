package Day07.Ex05_BoardInterface;

import java.util.Date;

public class Board extends Text {
	
	private int boardNo;

	
	// 생성자
	public Board() {
		this("제목 없음", "글쓴이 없음", "내용 없음");
		
	}
	
	public Board(String title, String writer, String content) {
		super(title, writer, content);
	}

	
	// getter, setter
	public int getBoardNo() {
		return boardNo;
	}
	
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
		
	
}
