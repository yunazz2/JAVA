package Day07.Ex05_BoardInterface;

public class Comment extends Text {

	private int commentNo;

	
	public Comment() {
		this("글쓴이 없음", "내용 없음");
	}

	public Comment(String writer, String content) {
		super(writer, content);
	}


	// getter, setter
	public int getCommentNo() {
		return commentNo;
	}


	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}
}
