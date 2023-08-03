package Day06;

import java.util.Date;

public class Board {
	
	private int boardNo;
	private String title;
	private String writer;
	private String content;
	// Date : 날짜/시간을 다루는 클래스
	private Date regDate;
	private Date updDate;
	
	// 생성자
	public Board() {
		this("제목 없음", "글쓴이 없음", "내용 없음");
		
	}
	
	public Board(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regDate = new Date();
		this.updDate = new Date();
	}

	
	// getter, setter
	public int getBoardNo() {
		return boardNo;
	}
	
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public Date getRegDate() {
		return regDate;
	}
	
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	public Date getUpdDate() {
		return updDate;
	}
	
	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}

	
	// toString
	// : 객체를 출력할 때, 지정한 문자열 형식으로 반환하는 메소드
	//  object(최상위 클래스)에 정의되어 있으며, 이를 오버라이딩 하여 사용한다.
	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", title=" + title + ", writer=" + writer + ", content=" + content
				+ ", regDate=" + regDate + ", updDate=" + updDate + "]";
	}
	
	
}
