import java.util.Scanner;

public class InputTest {

	public InputTest() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("input your name:");
		String name = in.nextLine();
		System.out.println("input your age:");
		int age = in.nextInt();
		//输入数据以什么形式存在哪里？
		
		System.out.println("name: "+ name + " age: " + age);
		
	}
}
