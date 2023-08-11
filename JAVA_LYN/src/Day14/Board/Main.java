/**
 * 게시판 프로그램
 * - 메뉴판
 * - 게시글 목록
 * - 게시글 읽기
 * - 게시글 쓰기
 * - 게시글 수정
 * - 게시글 삭제
 */
package Day14.Board;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Day14.Board.DTO.Board;
import Day14.Board.DTO.Comment;
import Day14.Board.DTO.Text;
import Day14.Board.Service.BoardService;
import Day14.Board.Service.BoardServiceImpl;
import Day14.Board.Service.CommentService;
import Day14.Board.Service.CommentServiceImpl;

public class Main {
	
	static List<Board> boardList = new ArrayList<Board>();			// 게시글 목록
	static List<Comment> commentList = new ArrayList<Comment>();	// 댓글 목록
	static Scanner sc = new Scanner(System.in);
	// 비즈니스 로직 계층으로 전환(Service 패키지)
//	static DataService data = new BoardDAO(); 		// 데이터 베이스 접근 객체 (게시글)
//	static DataService data2 = new CommentDAO(); 	// 데이터 베이스 접근 객체 (댓글)
	
	// 비즈니스 로직 계층의 객체를 생성
	static BoardService boardService = new BoardServiceImpl();
	static CommentService commentService = new CommentServiceImpl();
	
	/**
	 * 메뉴판
	 */
	public static void menu() {
		System.out.println("########## 게시판 ##########");
		System.out.println("1. 게시글 목록");
		System.out.println("2. 게시글 읽기");
		System.out.println("3. 게시글 쓰기");
		System.out.println("4. 게시글 수정");
		System.out.println("5. 게시글 삭제");
		System.out.println("6. 댓글 쓰기");
		System.out.println("7. 댓글 수정");
		System.out.println("8. 댓글 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("########## 번호 입력 : ");
	}
	
	/**
	 * 게시글 목록
	 */
	public static void list() {
		System.out.println("##### 게시글 목록 #####");
		
		boardList = boardService.list();
		printAll(boardList);
	
	}
	
	
	/**
	 * 글 목록 전체 출력 메소드
	 * @param list
	 */
	public static void printAll(List<? extends Text> list) {
		if(list == null || list.isEmpty()) {
			System.out.println("조회된 글이 없습니다.");
			return;
		}
		for (Text text : list) {
			print(text);
		}
	}
	
	
	/**
	 * 글 출력 메소드
	 * @param text
	 */
	public static void print(Text text) {
		
		if(text == null) {
			System.out.println("(조회되지 않는 글)");
			return;
		}
		
		int no = text.getNo();
		String title = text.getTitle();
		String writer = text.getWriter();
		String content = text.getContent();
		Date regDate = text.getRegDate();
		Date updDate = text.getUpdDate();
		
		System.out.println("- 글 번호 : " + no + "############################");
		if(text instanceof Board) { // 댓글은 제목이라는게 필요없으니깐, board면 제목을 출력하고! comment이면 출력 안 하고!
			System.out.println("- 글 제목 : " + title);
		}
		System.out.println("- 작성자 : " + writer);
		System.out.println("- 내용 : " + content);
		System.out.println("- 등록 일자 : " + regDate);
		System.out.println("- 수정 일자 : " + updDate);
		System.out.println("###############################################");
		System.out.println();
	}
	
	/**
	 * 게시글 읽기
	 * @param boardNo
	 */
	public static void read() {
		System.out.println("##### 게시글 읽기 #####");
		
		System.out.print("글 번호 : ");
		int boardNo = sc.nextInt();
		Text board = boardService.select(boardNo);
		
		print(board);
		
		// 해당 글의 댓글 목록
		commentList = commentService.list(boardNo);
		
		System.out.println("------------------ [댓글 목록] ------------------");
		printAll(commentList);

	}
	
	
	/**
	 * 게시글 쓰기
	 */
	public static void write() {
		System.out.println("##### 게시글 쓰기 #####");
		
		// 게시글 쓰기, 수정부분에 각각 아래 내용은 저 밑에 input() 메소드를 만들어 놔서, ln77처럼 한 줄로 만들 수 있다.
//		System.out.print("제목 : ");
//		String title = sc.nextLine();
//		System.out.print("작성자 : ");
//		String writer = sc.nextLine();
//		System.out.print("내용 : ");
//		String content = sc.nextLine();
		
//		Board board = new Board(title, writer, content);
		Board board = input();
		int result = boardService.insert(board);
		
		if(result > 0) {
			System.out.println("게시글이 작성되었습니다.");
			System.out.println();
		}
	}
	
	
	/**
	 * 게시글 수정
	 */
	public static void update() {
		System.out.println("##### 게시글 수정 #####");
		System.out.print("게시글 번호 : ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		
//		System.out.print("제목 : ");
//		String title = sc.nextLine();
//		System.out.print("작성자 : ");
//		String writer = sc.nextLine();
//		System.out.print("내용 : ");
//		String content = sc.nextLine();
		
//		Board board = new Board(title, writer, content);
		Board board = input();
		board.setBoardNo(boardNo);
		
		int result =  boardService.update(board);
		
		if(result > 0) {
			System.out.println("게시글이 수정되었습니다.");
			System.out.println();
		}
	}
	
	
	/**
	 * 게시글 삭제
	 */
	public static void delete() {
		System.out.println("##### 게시글 삭제 #####");
		
		System.out.print("게시글 번호 : ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		
		int result = boardService.delete(boardNo);
		if(result > 0) {
			System.out.println("게시글이 삭제되었습니다.");
			System.out.println();
		}
		
	}
	
	// 게시글 정보 입력
	public static Board input() {
		
		System.out.print("제목 : ");
		String title = sc.nextLine();
		System.out.print("작성자 : ");
		String writer = sc.nextLine();
		System.out.print("내용 : ");
		String content = sc.nextLine();
		
		Board board = new Board(title, writer, content);
		return board;
	}
	
	/**
	 * 댓글 쓰기
	 */
	public static void commentWrite() {
		System.out.println("##### 댓글 쓰기 #####");
		System.out.print("글 번호 : " );
		int boardNo = sc.nextInt();
		sc.nextLine(); // 엔터 없애주기
		
		Comment comment = inputComment();
		comment.setNo(boardNo); // no <- 게시글 번호(boardNo)
		
		int result = commentService.insert(comment);
		if(result > 0) {
			System.out.println("댓글이 작성되었습니다.");
		}
	}
	
	// 댓글 정보 입력
	public static Comment inputComment() {
		
		System.out.print("작성자 : ");
		String writer = sc.nextLine();
		System.out.print("내용 : ");
		String content = sc.nextLine();
		
		Comment comment = new Comment(writer, content);
		return comment;
	}
	
	
	/**
	 * 댓글 수정
	 */
	public static void commentUpdate() {
		System.out.println("##### 댓글 수정 #####");
		System.out.print("댓글 번호 : " );
		int commentNo = sc.nextInt();
		sc.nextLine();
		
		Comment comment = inputComment();
		comment.setNo(commentNo);
		
		int result = commentService.update(comment);
		if(result > 0) {
			System.out.println("댓글을 수정하였습니다.");
		}
	}
	
	/**
	 * 댓글 삭제
	 */
	public static void commentDelete() {
		System.out.println("##### 댓글 수정 #####");
		System.out.print("댓글 번호 : " );
		int commentNo = sc.nextInt();
		
		int result = commentService.delete(commentNo);
		if(result > 0) {
			System.out.println("댓글을 삭제하였습니다.");
		}
	}

	// 게시판 프로그램 시작
	public static void main(String[] args) {
		int menuNo = 0; // 메뉴 번호
		
		do {
			menu(); // 메뉴판 출력
			menuNo = sc.nextInt(); // 메뉴 번호 입력
			sc.nextLine(); //엔터를 입력버퍼에서 제거
			
			// 프로그램 종료
			if(menuNo == 0) break;
			
			
			// 메뉴 선택
			switch (menuNo) {
			case 1: list(); break; 			// 게시글 목록
			case 2: read(); break; 			// 게시글 읽기
			case 3: write(); break; 		// 게시글 쓰기
			case 4: update(); break; 		// 게시글 수정
			case 5: delete(); break; 		// 게시글 삭제
			case 6: commentWrite(); break; 	// 댓글 쓰기
			case 7: commentUpdate(); break; // 댓글 수정
			case 8: commentDelete(); break; // 댓글 삭제
			default: System.out.println("0~5 사이의 숫자를 입력해주세요."); break;
			}
			
		} while (menuNo != 0);
		
		System.out.println("프로그램을 종료합니다.");
	}
}
