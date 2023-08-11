package Day14.Board.Service;

import java.util.List;

import Day14.Board.DAO.BoardDAO;
import Day14.Board.DTO.Board;

public class BoardServiceImpl implements BoardService {

	private BoardDAO boardDAO = new BoardDAO();
	
	
	@Override
	public List<Board> list() {
		List<Board> boardList = (List<Board>) boardDAO.selectList();
		// 비즈니스 로직 구현
		// ... 
		return boardList;
	}

	@Override
	public Board select(int boardNo) {
		Board board = (Board) boardDAO.select(boardNo);
		return board;
	}

	@Override
	public int insert(Board board) {
		int result = boardDAO.insert(board);
		// * 비즈니스 로직 예시
		// 글 작성자 회원에게 포인트 10점을 부여하고싶다면 여기에 이렇게 쓴다.
		//if(result > 0) {
		//	userDAO.updatePoint(10);
		//}
		return result;
	}

	@Override
	public int update(Board board) {
		int result = boardDAO.update(board);
		return result;
	}

	@Override
	public int delete(int boardNo) {
		int result = boardDAO.delete(boardNo);
		return result;
	}

}
