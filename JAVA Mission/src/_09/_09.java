/**
주어진 미완성 코드와 실행결과 예시를 참고하여 성적 관리 프로그램을 완성하시오.
 */
package _09;

import java.util.Scanner;

public class _09 {
	// 10반
	// 20명
	// 6과목
	// 국어, 영어, 수학, 사회, 과학, 자바
	static int[][][] classStudentScore = new int[10][20][6];
	// 합계, 평균
	static double[][][] classStudentData = new double[10][20][2];
	// 반등수, 전교등수
	static int[][][] classStudentRank = new int[10][20][2];
	
	// 과목별 반등수, 전교등수
	static int[][][][] subjectStudentRank = new int[10][20][6][2];
	
	
	// 학생이름
	static String[][] classStudentName = new String[10][20];
	
	// 학생수
	static int[] classCount = new int[10];
	// 반별 총점
	static int[][] classTotalScore = new int[10][6+1];
	// 반별 평균
	static double[][] classTotalAverage = new double[10][6+1];

	// 반 입력여부
	static boolean[] classYn = new boolean[10];
	// 학생 입력여부
	static boolean[][] studentYn = new boolean[10][20];
	
	// 과목
	static String[] subjects = {"국어","영어","수학","사회","과학","자바"};
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * 숫자만 입력
	 * @return
	 */
	public static int inputNo() {
		int inputNo = 0;
		System.out.print(">> 입력 : ");
		while(!sc.hasNextInt()) {
			System.err.println("숫자만 입력할 수 있습니다.");
			sc.next();
			System.out.print(">> 입력 : ");
		}
		inputNo = sc.nextInt();
		return inputNo;
	}
	
	/**
	 * (start~end) 사이의 숫자만 입력
	 * @return
	 */
	public static int inputNo(int start, int end) {
		Integer inputNo = null;
		System.out.print(">> 입력 : ");
		while(!sc.hasNextInt() ||  ( (inputNo = Integer.parseInt( sc.next() ) ) < start ) || (inputNo > end)  )  {
			System.err.println("(" + start + "~" + end + ") 사이의 숫자만 입력할 수 있습니다.");
			if( inputNo == null )
				sc.next();
			inputNo = null;
			System.out.print(">> 입력 : ");
		}
		if( inputNo >= start && inputNo <= end ) return inputNo;
		inputNo = sc.nextInt();
		return inputNo;
	}
	
	
	/**
	 * (start~end) 사이의 숫자만 입력 + msg
	 * @return
	 */
	public static int inputNo(int start, int end, String msg) {
		Integer inputNo = null;
		System.out.print(msg);
		while(!sc.hasNextInt() ||  ( (inputNo = Integer.parseInt( sc.next() ) ) < start ) || (inputNo > end)  )  {
			System.err.println("(" + start + "~" + end + ") 사이의 숫자만 입력할 수 있습니다.");
			if( inputNo == null )
				sc.next();
			inputNo = null;
			System.out.print(msg);  
		}
		if( inputNo >= start && inputNo <= end ) return inputNo;
		inputNo = sc.nextInt();
		return inputNo;
	}
	
	/**
	 * 메뉴
	 * @return
	 */
	public static int menu() {
		System.out.println("========= 성적 관리 프로그램 =========");
		System.out.println("1. 성적 입력");
		System.out.println("2. 전체 조회");
		System.out.println("3. 반별 조회");
		System.out.println("4. 과목별 조회");
		System.out.println("5. 학생 조회");
		System.out.println("0. 종료");
		System.out.println("==================================");
		
		return inputNo(0, 5);
	}
	
	/**
	 * 1. 성적 입력
	 */
	public static void input() {
		System.out.println("========= 1. 성적 입력 =========");
		System.out.println(">> 반 번호(1~10) ");
		int classNo = inputNo(1, 10);
		int studentNo = 0;
		
		System.out.println("(1) 일괄 입력");
		System.out.println("(2) 개별 입력");
		int inputMenu = inputNo(1, 2);
		
		switch (inputMenu) {
				case 1:
						inputAll(classNo);
						break;
				case 2: 
						System.out.print(">> 학생 번호(1~20) : ");
						studentNo = sc.nextInt();
						inputStudent(classNo, studentNo);
				default:
						break;
		}
		
	}
	
	/**
	 * 1. 성적 입력
	 * 	(1) 일괄 입력
	 */
	public static void inputAll(int classNo) {
		System.out.println("========= 1-(1). 일괄 입력 =========");
		System.out.println(">> 학생 수 ");
		int studentCount = inputNo(1,20);
		classCount[classNo-1] = studentCount;
		
		for (int i = 0; i < studentCount; i++) {
			System.out.println("[" + (i+1) + "]번 학생");
			
			// 이름
			System.out.print(">> 이름 : ");
			classStudentName[classNo-1][i] = sc.next();
			// 성적
			System.out.println(">> 성적 :");
			subjects();
			for (int j = 0; j < classStudentScore[classNo][i].length; j++) {
				classStudentScore[classNo-1][i][j] = inputNo(0, 100, ">> " + subjects[j]+ " : ");
			}
			
			// 총점, 평균 계산
			calcSumAverage(classNo, i+1);
		}
		
		// 반 입력여부
		classYn[classNo-1] = true;
		
		// 학생 입력여부
		for (int i = 0; i < studentCount; i++) {
			studentYn[classNo-1][i] = true;
		}
		
		// 등수 계산
		calcRank(classNo);
		
		// 반별 합계/평균 계산
		calcClassTotal(classNo);
		
		System.out.println(classNo + " 반 " + studentCount + " 명의 학생 성적 입력완료!");
	}
	
	/**
	 * 1. 성적 입력
	 * 	(2) 개별 입력
	 */
	public static void inputStudent(int classNo, int studentNo) {
		System.out.println("========= 1-(2). 개별 입력 =========");
		// 이름
		System.out.print(">> 이름 : ");
		classStudentName[classNo-1][studentNo-1] = sc.next();
		sc.nextLine();
		
		// 성적
		System.out.println(">> 성적 :");
		subjects();
		
		for (int i = 0; i < classStudentScore[classNo-1][studentNo-1].length; i++) {
			classStudentScore[classNo-1][studentNo-1][i] = inputNo(0, 100, ">> " + subjects[i]+ " : ");
		}
		
		// 반 입력여부
		classYn[classNo-1] = true;
		
		// 학생 입력여부
		studentYn[classNo-1][studentNo-1] = true;
		
		// 총점, 평균 계산
		calcSumAverage(classNo, studentNo);
		
		// 등수 계산
		calcRank(classNo);
		
		// 반별 합계/평균 계산
		calcClassTotal(classNo);
		
		System.out.println(classNo + " 반 " + studentNo + " 번 학생의 성적 입력완료!");
	}
	
	

	/**
	 * 2. 전체 조회
	 */
	public static void listAll() {
		
		for (int i = 0; i < classStudentScore.length; i++) {
			if( classYn[i] ) {
				System.out.println("===================================================== " + (i+1) + " 반 =======================================================");
				System.out.print("============= \t");
				titleTab();
				System.out.println(" ================");
			
				for (int j = 0; j < classStudentScore[i].length; j++) {
					if( classYn[i] && studentYn[i][j] ) {
						System.out.print("[" + (j+1) + "] " + classStudentName[i][j] + " : \t");
						for (int k = 0; k < classStudentScore[i][j].length; k++) {
							if( classYn[i] && studentYn[i][j] )
								System.out.print(classStudentScore[i][j][k] + "\t");
						}
						System.out.print(classStudentData[i][j][0] + "\t" + classStudentData[i][j][1] + "\t");
						System.out.print(classStudentRank[i][j][0] + "\t" + classStudentRank[i][j][1] + "\t");
						System.out.println();
					}
				}
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.print("총점 : \t\t");
				for (int j = 0; j < classTotalScore[i].length; j++) {
					System.out.print(classTotalScore[i][j] + "\t");
				}
				System.out.println();
				System.out.print("평균 : \t\t");
				for (int j = 0; j < classTotalAverage[i].length; j++) {
					if( j == classTotalAverage[i].length - 1 ) System.out.print("\t");
					System.out.print(classTotalAverage[i][j] + "\t");
				}
			}
			if( classYn[i] ) System.out.println();
		}
		
	}
	
	/**
	 * 3. 반별 조회
	 */
	public static void classList() {
		
		System.out.print(">> 반 번호(1~10) : ");
		int classNo = inputNo(1, 10);
		
		if( classYn[classNo-1] ) {
			System.out.println("===================================================== " + (classNo) + " 반 =======================================================");
			System.out.print("============= \t");
			titleTab();
			System.out.println(" ================");
		}
		for (int i = 0; i < classStudentScore[classNo-1].length; i++) {
			if( classYn[classNo-1] && studentYn[classNo-1][i] ) {
				System.out.print("[" + (i+1) + "] " + classStudentName[classNo-1][i] + " : \t");
				for (int j = 0; j < classStudentScore[classNo-1][i].length; j++) {
						System.out.print(classStudentScore[classNo-1][i][j] + "\t");
				}
				System.out.print(classStudentData[classNo-1][i][0] + "\t" + classStudentData[classNo-1][i][1] + "\t");
				System.out.print(classStudentRank[classNo-1][i][0] + "\t" + classStudentRank[classNo-1][i][1] + "\t");
				System.out.println();
			}
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.print("총점 : \t\t");
		// TODO
		
		System.out.println();
		System.out.print("평균 : \t\t");
		// TODO
		
		
		if( classYn[classNo-1] ) System.out.println();
		
	}
	

	/**
	 * 4. 과목별 조회
	 */
	public static void subjectList() {
		
		System.out.println("(1) 국어 (2) 영어 (3) 수학 (4) 사회 (5) 과학 (6) 자바");
		System.out.println(">> 과목 번호(1~6) ");
		int subjectNo = inputNo(1, 6);
		
		System.out.println("(1) 전체 조회");
		System.out.println("(2) 반별 조회");
		int subjectMenu = inputNo(1, 2);
		
		switch (subjectMenu) {
				case 1:
						subjectListAll(subjectNo);
						break;
				case 2: 
						subjectList(subjectNo);
						break;
				default:
						break;
		}
	}
	
	/**
	 * 4.과목별 조회
	 * 	(1) 전체 조회
	 * @param subjectNo
	 */
	public static void subjectListAll(int subjectNo) {
		for (int i = 0; i < classStudentScore.length; i++) {
			if( classYn[i] ) {
				System.out.println("========================= " + (i+1) + " 반 ===========================");
				System.out.print("============= \t");
				titleTab(subjectNo);
				System.out.println(" ================");
			}
			for (int j = 0; j < classStudentScore[i].length; j++) {
				if( classYn[i] && studentYn[i][j] ) {
					System.out.print("[" + (j+1) + "] " + classStudentName[i][j] + " : \t");
					System.out.print(classStudentScore[i][j][subjectNo-1] + "\t");
					System.out.print(subjectStudentRank[i][j][subjectNo-1][0] + "\t");
					System.out.print(subjectStudentRank[i][j][subjectNo-1][1] + "\t");
					System.out.println();
				}
			}
			if( classYn[i] ) System.out.println();
		}
	}

	/**
	 * 4. 과목별 조회
	 *  (2) 반별 조회
	 * @param classNo
	 * @param subjectNo
	 */
	public static void subjectList(int subjectNo) {
		System.out.print(">> 반 번호(1~10) ");
		int classNo = inputNo(1, 10);
		
		if( classYn[classNo-1] ) {
			System.out.println("========================= " + (classNo) + " 반 ===========================");
			System.out.print("============= \t");
			titleTab(subjectNo);
			System.out.println(" ================");
		}
		for (int j = 0; j < classStudentScore[classNo-1].length; j++) {
			if( classYn[classNo-1] && studentYn[classNo-1][j] ) {
				System.out.print("[" + (j+1) + "] " + classStudentName[classNo-1][j] + " : \t");
				System.out.print(classStudentScore[classNo-1][j][subjectNo-1] + "\t");
				System.out.print(subjectStudentRank[classNo-1][j][subjectNo-1][0] + "\t");
				System.out.print(subjectStudentRank[classNo-1][j][subjectNo-1][1] + "\t");
				System.out.println();
			}
		}
		if( classYn[classNo-1] ) System.out.println();
	}
	
	/**
	 * 5. 학생 조회
	 */
	public static void searchStudent() {
		System.out.print(">> 반 번호(1~10) : ");
		int classNo = sc.nextInt();
		
		System.out.print(">> 학생 번호(1~20) : ");
		int studentNo = sc.nextInt();
		
		if( classYn[classNo-1] ) {
			System.out.println("===================================================== " + classNo + " 반 =======================================================");
			System.out.print("============= \t");
			titleTab();
			System.out.println(" ================");
		}
		
		if( classYn[classNo-1] && studentYn[classNo-1][studentNo-1] ) {
			System.out.print("[" + (studentNo) + "] " + classStudentName[classNo-1][studentNo-1] + " : \t");
			for (int i = 0; i < classStudentScore[classNo-1][studentNo-1].length; i++) {
				System.out.print(classStudentScore[classNo-1][studentNo-1][i] + "\t");
			}
			System.out.print(classStudentData[classNo-1][studentNo-1][0] + "\t" + classStudentData[classNo-1][studentNo-1][1] + "\t");
			System.out.print(classStudentRank[classNo-1][studentNo-1][0] + "\t" + classStudentRank[classNo-1][studentNo-1][1] + "\t");
			System.out.println();
		}
		
		
	}
	
	
	/**
	 * 과목 출력
	 */
	public static void subjects() {
		for (int i = 0; i < subjects.length; i++) {
			System.out.print(subjects[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * 조회 탭 출력 (전체) 
	 */
	public static void titleTab() {
		for (int i = 0; i < subjects.length; i++) {
			System.out.print(subjects[i] + "\t");
		}
		System.out.print("총점\t평균\t");
		System.out.print("반등수\t전교등수\t");
	}
	
	
	/**
	 * 조회 탭 출력 (과목)
	 */
	public static void titleTab(int subjectNo) {
		System.out.print(subjects[subjectNo-1] + "\t");
		System.out.print("반등수\t전교등수\t");
	}
	
	
	/**
	 * (학생) 총점, 평균 계산
	 * @param classStudentScore
	 * @param classNo
	 * @param studentNo
	 */
	public static void calcSumAverage(int classNo, int studentNo) {
		int sum = 0;
		double avg = 0.0;
		
		for (int i = 0; i < classStudentScore[classNo-1][studentNo-1].length; i++) {
			sum += classStudentScore[classNo-1][studentNo-1][i];
		}
		
		avg = Math.round( (double) sum / (double) classStudentScore[classNo-1][studentNo-1].length * 100.0 ) / 100.0;
		
		classStudentData[classNo-1][studentNo-1][0] = sum;
		classStudentData[classNo-1][studentNo-1][1] = avg;
	}
	
	/**
	 * 등수 계산
	 * @param classNo
	 */
	public static void calcRank(int classNo) {
		
		// 반 등수 계산
		
		// 반 등수 계산 (끝)
		
		// 과목별 반 등수 계산
		
		// 과목별 반 등수 계산 (끝)
		
		
		// 전교 등수 계산
		
		
		// 전교생 :  
		// [학생수][0] : 총점
		// [학생수][1] : 등수
		
		// 전교 등수 계산 (끝)
		
		
		// 과목별 전교 등수 계산
		
		// 과목별 전교 등수 계산 (끝)
		
	}
	
	/**
	 * (반별) 총점, 평균 계산
	 * @param classNo
	 */
	public static void calcClassTotal(int classNo) {
		for (int i = 0; i < classStudentScore[classNo-1].length; i++) {
			// 과목별 총점
			for (int j = 0; j < classStudentScore[classNo-1][i].length; j++) {
				classTotalScore[classNo-1][j] += classStudentScore[classNo-1][i][j];
			}
		}
		
		// 반 전체 총점
	
		
		// 과목별 평균
		
		
		// 반 전체 평균
		classTotalAverage[classNo-1][6] = Math.round( (double) classTotalScore[classNo-1][6] / classCount[classNo-1] / 6 * 100.0 ) / 100.0 ;
		
		
	}

	public static void main(String[] args) {
		
		do {
			int menuNo = menu();
			if( menuNo == 0 ) break;
			
			switch (menuNo) {
				case 1:
						input();
						break;
				case 2:
						listAll();
						break;
				case 3:
						classList();
						break;
				case 4:
						subjectList();
						break;
				case 5:
						searchStudent();
						break;
				default:
						break;
			}
			
		} while (true);
		
		System.out.println("프로그램 종료.");
		
	}
}
