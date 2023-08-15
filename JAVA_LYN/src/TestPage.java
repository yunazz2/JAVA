// 내가 이것저것 테스트해보는 페이지

import java.util.Arrays;

public class TestPage {
	
	public static void main(String[] args) {
		String arr[] = {"a", "b", "c", "d", "f"};
		
		int index = Arrays.binarySearch(arr, "d");
		
		System.out.println(Arrays.toString(arr));
		System.out.println(index + " 에 해당하는 값 -> " + arr[index]);
	}
	

}
