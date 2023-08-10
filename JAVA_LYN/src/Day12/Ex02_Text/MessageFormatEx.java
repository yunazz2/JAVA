package Day12.Ex02_Text;

import java.text.MessageFormat;
import java.util.Scanner;

public class MessageFormatEx {

	public static void main(String[] args) {
		// 문자열 형식을 만들고,
		// 문자열에 데이터가 들어갈 자리를 {k}로 표시한다. (k : 0~)
		// \n : 한 줄 개행(엔터)
		// \t : 탭
		String text = "아이디 : {0}\n비밀번호 : {1}";
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.next();
		
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		
		String login = MessageFormat.format(text, id, pw);
		
		System.out.println(login);
		System.out.println();
		
		String[] studentInfo = {"이유나", "15학번", "신재생에너지", "28살"};
		String studentFormat = "이름 : {0} \n"
							 + "학번 : {1} \n"
							 + "전공 : {2} \n"
							 + "나이 : {3} \n"
							 ;
		String student = MessageFormat.format(studentFormat, studentInfo);
		System.out.println(student);
	}
}
