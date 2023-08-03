/**
 * 게시판 프로그램
 * - 메뉴판
 * - 게시글 목록
 * - 게시글 읽기
 * - 게시글 쓰기
 * - 게시글 수정
 * - 게시글 삭제
 */
package Day07.Ex05_BoardInterface;

import java.text.spi.DateFormatSymbolsProvider;
import java.util.Date;
import java.util.Scanner;

public class Main {
	
	static int max = 10; // 게시글 최대 개수
	static Text[] boardList = new Board[max];
	static Scanner sc = new Scanner(System.in);
	static DataService data = new BoardAccess(); // 데이터 베이스 접근 객체 (게시글)
	static DataService data2 = new CommentAccess(); // 데이터 베이스 접근 객체 (댓글)
	
	/**
	 * 메뉴판
	 */
	public static void menu() {
		System.out.println("########## 게시판 ##########");
		System.out.println("1. 게시판 목록");
		System.out.println("2. 게시글 읽기");
		System.out.println("3. 게시글 쓰기");
		System.out.println("4. 게시글 수정");
		System.out.println("5. 게시글 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("########## 번호 입력 : ");
	}
	
	/**
	 * 게시글 목록
	 */
	public static void list() {
		System.out.println("##### 게시글 목록 #####");
		
		boardList = data.selectList();
		for (Text board : boardList) {
			
			if (board == null) {
				System.out.println("(게시글 없음)");
				continue;
			}
			int boardNo = board.getNo();
			String title = board.getTitle();
			String writer = board.getWriter();
			Date regDate = board.getRegDate();
			
			System.out.println("(" + boardNo + ") \t | " + title + " \t | " + writer + " \t | " + regDate );			
		}
	}
	
	
	/**
	 * 게시글 읽기
	 * @param boardNo
	 */
	public static void read() {
		System.out.println("##### 게시글 읽기 #####");
		
		System.out.print("글 번호 : ");
		int boardNo = sc.nextInt();
		Text board = data.select(boardNo);
		
		String title = board.getTitle();
		String writer = board.getWriter();
		String content = board.getContent();
		Date regDate = board.getRegDate();
		Date updDate = board.getUpdDate();
		
		System.out.println("- 글 번호 : " + boardNo);
		System.out.println("- 글 제목 : " + title);
		System.out.println("- 작성자 : " + writer);
		System.out.println("- 내용 : " + content);
		System.out.println("- 등록 일자 : " + regDate);
		System.out.println("- 수정 일자 : " + updDate);
		System.out.println("###############################################");
		System.out.println();
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
		int result = data.insert(board);
		
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
		
		int result =  data.update(board);
		
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
		
		int result = data.delete(boardNo);
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
			case 1: list(); break; // 게시글 목록
			case 2: read(); break; // 게시글 읽기
			case 3: write(); break; // 게시글 쓰기
			case 4: update(); break; // 게시글 수정
			case 5: delete(); break; // 게시글 삭제
			default: System.out.println("0~5 사이의 숫자를 입력해주세요."); break;
			}
			
		} while (menuNo != 0);
		
		System.out.println("프로그램을 종료합니다.");
	}
}
