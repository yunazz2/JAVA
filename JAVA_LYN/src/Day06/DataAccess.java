package Day06;

import java.sql.SQLException;

// JDBConnection 상속
public class DataAccess extends JDBConnection {
	
	// 데이터 목록 조회
	public Board[] selectList() {
		
		int max = Main.max;
		Board[] boardList = new Board[max];
		
		// 데이터베이스의 명령어
		// SQL
		String sql = " SELECT * "
				+ " FROM board ";
		
		try {
			stmt = con.createStatement(); // 쿼리(ln16~ln17) 실행 객체 생성
			rs = stmt.executeQuery(sql); // 쿼리 실행 - 결과 => rs (ResultSet)
			
			int i = 0;
			// 조회 결과를 배열에 추가
			while (rs.next()) {
				Board board = new Board();
				
				// 결과 데이터 가져오기
				// rs.getXXX("컬럼명") => 해당 컬럼의 데이터를 가져온다.
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getTimestamp("reg_date"));
				board.setUpdDate(rs.getTimestamp("upd_date"));
				
				if (i >= max) break;
				boardList[i++] = board;
			}
			
			
			
		} catch (SQLException e) {
			System.err.println("게시글 목록 조회 시, 에러 발생");
			e.printStackTrace();
		}		
		
		return boardList;
	}
	
	// 데이터 조회(게시글 읽기)
	public Board select(int boardNo) {
		Board board = new Board();
		
		String sql = " SELECT * "
				+ " FROM board "
				+ " WHERE board_no = ? ";
		
		try {
			psmt = con.prepareStatement(sql); // 쿼리(ln55~ln57) 실행 객체 생성
			// psmt.setXXX( 순서 번호, 매핑할 값 );
			psmt.setInt(1, boardNo); // ?(1) <-- boardNo(글 번호)
			rs = psmt.executeQuery(); // 쿼리 실행
			
			
			// 조회 결과 가져오기
			if(rs.next()) {
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getTimestamp("reg_date"));
				board.setUpdDate(rs.getTimestamp("upd_date"));
			}
			
		} catch (SQLException e) {
			System.err.println("게시글 조회 시, 에러 발생");
			e.printStackTrace();
		}
		
		return board;	
	}
	
	// 데이터 등록(게시글 쓰기)
	public int insert(Board board) {
		
		int result = 0;
		String sql = " INSERT INTO board( title, writer, content )"
				+ " VALUES( ?, ?, ? ) ";
		
		try {
			psmt = con.prepareStatement(sql);		// 쿼리 실행 객체 생성(ln88~ln89)
			psmt.setString(1, board.getTitle()); 	// 1번 ?에 제목을 매핑
			psmt.setString(2, board.getWriter()); 	// 2번 ?에 작성자를 매핑
			psmt.setString(3, board.getContent()); 	// 3번 ?에 내용을 매핑
			
			result = psmt.executeUpdate();			// SQL 실행 요청, 적용된 데이터 개수를 받아옴
													// 게시글 1개 쓰기 성공시, result : 1
													// 			   실패시, result : 0			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	// 데이터 수정(게시글 수정)
	public int update(Board board) {
		
		int result = 0;
		
		String sql = " UPDATE board "
				+ " SET title = ? "
				+ " 	,writer = ? "
				+ " 	,content = ? "
				+ " 	,upd_date = now() "
				+ " WHERE board_no = ? "
				;
		// - now() : 현재 날짜/시간을 반환하는 MySQL 함수
		
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, board.getTitle()); 	// 1번 ?에 제목을 매핑
			psmt.setString(2, board.getWriter()); 	// 2번 ?에 작성자를 매핑
			psmt.setString(3, board.getContent()); 	// 3번 ?에 내용을 매핑
			psmt.setInt(4, board.getBoardNo()); 	// 4번 ?에 게시글 번호를 매핑
			
			result = psmt.executeUpdate();			// SQL 실행 요청, 적용된 데이터 개수를 받아옴
													// 게시글 1개 쓰기 성공시, result : 1
													// 			   실패시, result : 0			
						
		} catch (SQLException e) {
			System.err.println("게시글 수정 시, 에러 발생");
			e.printStackTrace();
		}
		
		return result;		
	}
	
	// 데이터 삭제(게시글 삭제)
	public int delete(int boardNo) {
		int result = 0;
		
		String sql = " DELETE FROM board "
				+ " WHERE board_no = ? ";
		
		try {
			psmt = con.prepareStatement(sql); // 쿼리 실행 객체 생성(ln143~ln144)
			psmt.setInt(1, boardNo); // 1번 ?에 글 번호를 매핑
			
			result = psmt.executeUpdate(); // SQL 실행 요청
			
		} catch (SQLException e) {
			System.err.println("게시글 삭제 시, 에러 발생");
			e.printStackTrace();
		}
		
		return result;

	}
	
}
