import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello Java~!");
		int arr[] = {1, 2, 3, 4, 5};
		
		System.out.println(Arrays.toString(arr));
		
		int num1 = 0 ;
		int num2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번쨰 정수 : ");
		num1 = sc.nextInt();
		System.out.print("두번쨰 정수 : ");
		num2 = sc.nextInt();
		
		System.out.println("첫번쨰 정수 : "+num1);
		System.out.println("두번쨰 정수 : "+num2);
		System.out.print("두 수의 합   : ");
		System.out.println(num1+num2);
		
		
	}

}

//
//import java.util.Scanner;
//
//public class InputTest {
//
//	public static void main(String[] args) {
//		
//		int num1 = 0 ;
//		int num2 = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("첫번쨰 정수 : ");
//		num1 = sc.nextInt();
//		System.out.print("두번쨰 정수 : ");
//		num2 = sc.nextInt();
//		
//		System.out.println("첫번쨰 정수 : "+num1);
//		System.out.println("두번쨰 정수 : "+num2);
//		System.out.print("두 수의 합   : ");
//		System.out.println(num1+num2);
//	}
//
//}