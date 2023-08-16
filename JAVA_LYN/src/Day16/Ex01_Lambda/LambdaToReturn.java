package Day16.Ex01_Lambda;


@FunctionalInterface
interface PrintString {
	void showString(String msg);
}

public class LambdaToReturn {
	public static void main(String[] args) {
		
		PrintString ps1 = returnLambda(1);
		PrintString ps2 = returnLambda(2);
		PrintString ps3 = returnLambda(3);
		
		ps1.showString("안녕하세요1");
		ps2.showString("안녕하세요2");
		ps3.showString("안녕하세요3");
		
	}

	private static PrintString returnLambda(int code) {
		switch (code) {
			case 1:
				return msg -> System.out.println("메시지 : " + msg);
			case 2:
				return msg -> {
					System.out.println("메시지 : ");
					System.out.println(msg);
				};
			case 3:
				return (msg) -> System.out.println(msg);
		}
		return (msg) -> System.out.println(msg);
	}
}
