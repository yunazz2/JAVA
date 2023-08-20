/**
chatgpt 선생님의 도움 ㅠㅠ..
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//import Ex03.Student;

public class Manager2 {
//    public static void main(String[] args) {
//        // 데이터를 저장할 ArrayList 생성
//        List<Student> studentList = new ArrayList<>();
//
//        // 파일 경로
//        String filePath = "./src/Ex03/student.txt";
//        
//		
//        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                // "/"를 기준으로 데이터를 분리하여 배열에 저장
//                String[] data = line.split("/");
//                if (data.length == 4) {
//                    int no = Integer.parseInt(data[0]);
//                    String name = data[1];
//                    int score = Integer.parseInt(data[2]);
//                    String className = data[3];
//                    studentList.add(new Student(no, name, score, className));
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // 성적을 내림차순으로 정렬, 성적이 같다면 번호를 오름차순으로 정렬
//        studentList.sort(
//            Comparator.comparingInt(Student::getScore).reversed().thenComparingInt(Student::getNo));
//
//        // 정렬된 데이터 출력
//        for (Student student : studentList) {
//            System.out.println(student);
//        }
//    }
}