package Day14.Board.Service;

import java.util.List;

import Day14.Board.DAO.CommentDAO;
import Day14.Board.DTO.Comment;

public class CommentServiceImpl implements CommentService {

	private CommentDAO commentDAO = new CommentDAO();
	
	@Override
	public List<Comment> list() {
		List<Comment> commentList = (List<Comment>) commentDAO.selectList();
		return commentList;
	}
	
	@Override
	public List<Comment> list(int boardNo) {
		List<Comment> commentList = (List<Comment>) commentDAO.selectList(boardNo);
		return commentList;
	}

	@Override
	public Comment select(int commentNo) {
		Comment comment = (Comment) commentDAO.select(commentNo);
		return comment;
	}

	@Override
	public int insert(Comment comment) {
		int result = commentDAO.insert(comment);
		return result;
	}

	@Override
	public int update(Comment comment) {
		int result = commentDAO.update(comment);
		return result;
	}

	@Override
	public int delete(int commentNo) {
		int result = commentDAO.delete(commentNo);
		return result;
	}

}
