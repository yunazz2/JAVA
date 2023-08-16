package Day16.Ex02_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamReduce {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(90);
		list.add(60);
		list.add(80);
		list.add(70);
		
		Stream<Integer> s = list.stream();
		s.sorted().forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		// ---------------------------------------------------------
		List<String> wordList = new ArrayList<String>();
		wordList.add("안녕하세요~!");
		wordList.add("1시간 뒤면");
		wordList.add("집에 갈 시간입니다.");
		wordList.add("reduce()를 알아보아요.");
		
		String msg = wordList.stream().reduce("", (a, b) -> a + " " + b);
		System.out.println(msg);
		System.out.println();
		
		// ---------------------------------------------------------
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(2);
		numList.add(3);
		numList.add(4);
		numList.add(5);
		
		int result = numList.stream().reduce(0, (sum, item) -> sum + item);
		System.out.println("result : " + result);
		
		Optional<Integer> firstEven = numList.stream().filter(n -> n % 2 == 0).findFirst();
		
		if(firstEven.isPresent()) {// 존재하는지
			System.out.println("첫번째 짝수 : " + firstEven.get());
		}
		else {
			System.out.println("짝수가 없습니다.");
		}
		
		// 첫번째 짝수를 찾아서, 존재하면 출력하시오.
		numList.stream().filter(n -> n % 2 == 0).findFirst().ifPresent(n -> System.out.print(n));
	}
}
