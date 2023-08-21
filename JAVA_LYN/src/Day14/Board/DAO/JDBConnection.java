// 데이터 베이스랑 연결하는 코드 작성
package Day14.Board.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBConnection {

	public Connection con;				// 연결된 드라이버에 SQL을 요청할 객체를 생성하는 클래스
	public Statement stmt;				// SQL 실행 요청을 하는 클래스
	public PreparedStatement psmt;		// Statement에서 ? 파라미터 확장 기능을 추가로 제공하는 클래스
	public ResultSet rs;				// SQL 실행 결과를 받아오는 클래스
	
	// 기본 생성자
	public JDBConnection() {
		// JDBC 드라이버 로드
		// MySQL
		try {
			// mysql-connector-j.xxx.jar 드라이버의 클래스를 로드한다.
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// DB에 연결
			// - 연결에 필요한 정보 : URL, ID, PW
			// URL : jdbc:mysql://도메인:[PORT]/[스키마]?옵션파라미터
			// * 내 PC의 IP 주소 : localhost : 127.0.0.1
			// * 3306 : MySQL 데이터베이스의 기본 포트
			// * 아래 localhost 부분에 192.168.30.119 << 넣으면 이거 선생님 db에 들어가서 글 쓰고 댓글 쓰기 가능ㅋㄷ
			String url = "jdbc:mysql://localhost:3306/joeun?serverTimezone=Asia/Seoul&allowPublicKeyRetrieval=true&useSSL=false";
			String id = "joeun";
			String pw = "123456";
			
			// 자바 프로그램에서 JDBC 프로그램을 연결시켜주는 클래스
			// getConnection() 메소드로 DB에 연결 요청하고 생성된 Connection 객체를 반환받는다.
			con = DriverManager.getConnection(url, id, pw);
			
			System.out.println("DB 연결 성공");
		} catch (Exception e) {
			System.err.println("DB 연결 실패");
			e.printStackTrace();
		}
	}
	
//	public static void main(String[] args) {
//		JDBConnection jdbc = new JDBConnection();
//	}
}
