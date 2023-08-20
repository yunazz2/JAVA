/**
[문제3번] 모두의 코딩에서 월말 코딩 대회를 열었다. 매니저는 학생들의 성적을 취합하여 “student.txt” 파일로 정리하였다.
한 학생의 성적은 다음과 같은 양식으로 기록되어 있다. txt 파일에서 학생들의 성적정보 (번호/이름/성적/수업이름) 추출하여,
성적 순으로 내림차순, 번호 순으로 오름차순 정렬하여 출력하시오.

[출력]
9 수프링 100 백엔드
1 김모두 90 프론트엔드
7 감자바 90 백엔드
8 이에스 90 백엔드
10 이액트 90 프론트엔드
2 박한별 80 퍼블리싱
3 이코딩 80 백엔드
5 황이프 55 퍼블리싱
4 최루프 45 프론트엔드
6 한로하 20 백엔드
 */
package Ex03;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Manager {
	public static void main(String[] args) {
        // 데이터를 저장할 ArrayList 생성
        ArrayList<Student> studentList = new ArrayList<>();
        
        // 파일 경로
        String filePath = "./src/Ex03/student.txt";
        
        try {
        	Scanner sc = new Scanner(new File(filePath));	// 원래 평소엔 스캐너 객체 쓸 때 System.in을 써왔는데, 그 부분에 파일을 읽어 올 수 있는 파일 객체를 생성
        	
        	while(sc.hasNext()) {				// 스캐너로 더 이상 읽을 요소가 없을 때까지 반복
        		String str = sc.nextLine();		// 스캐너로 txt파일을 읽어 한 줄씩 str 변수에 저장
//        		System.out.println(str);
        		
        		String[] data = str.split("/"); // 읽어 온 한 줄을 data 배열 변수에 "/"를 기준으로 잘라 저장
 
    			int no = Integer.parseInt(data[0]);
    			String name = data[1];
    			int score = Integer.parseInt(data[2]);
    			String className = data[3];
    			
    			studentList.add(new Student(no, name, score, className));	// Student 클래스에 있는 생성자 포맷대로 객체로 생성해서 studentList에 저장
        	}

        } catch(IOException e) {
        	System.err.println("문자 입력 시 예외가 발생했습니다.");
        	e.printStackTrace();
        }
        
        
        // 성적을 내림차순으로 정렬, 성적이 같다면 번호를 오름차순으로 정렬
        studentList.sort(Comparator.comparingInt(Student::getScore).reversed().thenComparingInt(Student::getNo));
        
        
        // 정렬된 데이터 출력
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}