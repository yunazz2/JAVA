
package Day14.Board.Service;

import java.util.List;

import Day14.Board.DTO.Board;

public interface BoardService {

	// 게시글 목록
	List<Board> list();

	// 게시글 조회
	Board select(int boardNo);
	
	// 게시글 추가
	int insert(Board board);
	
	// 게시글 수정
	int update(Board board);
	
	// 게시글 삭제
	int delete(int boardNo);
}
