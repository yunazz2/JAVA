import java.util.ArrayList;

public class Sample {
	
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		
		a.add("1");
		a.add("2");
		a.add("3");
		
		
		
		a.add(1, "4");
		System.out.println(a);
	}
}
